package com.sundsoft.webservice.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.cache.CustomizedPropertyConfigurer;
import com.sundsoft.service.dasExchange.IExchangeService;
import com.sundsoft.utils.DateUtil;
import com.sundsoft.utils.Encodes;
import com.sundsoft.webservice.IDASExchangeServices;
import com.sundsoft.webservice.IDocTransServices;

import net.sf.json.JSONObject;

public class DASExchangeServiceImpl implements IDASExchangeServices {

	private static final Logger log = LogManager.getLogger(DASExchangeServiceImpl.class);

	private JSONObject resJson = null;

	private static final String SUCC_CODE = "00000";

	private static final String SUCC_INFO = "交易成功";

	private static final String ERR_CODE = "-1";

	private static IDocTransServices readerService = null;
	static {

		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(IDocTransServices.class);
		factoryBean.setAddress(CustomizedPropertyConfigurer.getContextProperty("trans.webservice.url").toString());

		readerService = (IDocTransServices) factoryBean.create();
	}

	@Autowired
	private IExchangeService exchangeService;

	@Override
	public String CreateDaPackage(int areaId, String pkgKeyCode, String owner, String keyword, String creater,
			String title, String script) {
		String m_Dic = String.format("%s\\%s\\%s\\%s", areaId, DateUtil.DateToStr(new Date(), "yyyy"),
				DateUtil.DateToStr(new Date(), "M"), UUID.randomUUID().toString());
		Map<String, Object> resMap = exchangeService.CreateDaPackage(pkgKeyCode, owner, keyword, creater, title, script,
				m_Dic);
		return JSONObject.fromObject(resMap).toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public String SaveFile(String arcCode, int eleId, byte[] fileData, String creater) {
		resJson = new JSONObject();
		String errorInfo = "";
		Map<String, Object> resMap = exchangeService.GetFileDicInfo(arcCode, eleId);
		List<Map<String, Object>> dataMaps = (List<Map<String, Object>>) resMap.get("content");
		if (dataMaps == null || dataMaps.size() == 0) {
			errorInfo = String.format("查询目录信息发生错误,错误信息：%s", !StringUtils.isBlank(exchangeService.getErrorMsg())
					? exchangeService.getErrorMsg() : "未能查询出文件目录信息");
			resJson.put("errorCode", resMap.get("errorCode"));
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		Map<String, Object> m_Dr = dataMaps.get(0);
		String m_Path = m_Dr.get("FILEFULLPATH").toString();
		char oldChar = (File.separatorChar == '\\') ? '/' : '\\';
		if(m_Path.contains(""+oldChar)){
			m_Path = m_Path.replace(""+oldChar, File.separator);
		}
		String m_FileName = m_Dr.get("FILENAME").toString();
		String m_SubDir = m_Dr.get("SUBDIR").toString();
		int m_FileIndex = Integer.parseInt(m_Dr.get("FILEINDEX").toString());
		try {

			boolean m_Result = readerService.WriteFile(m_Path, m_FileName, fileData);

			if (!m_Result) {
				resJson.put("errorCode", ERR_CODE);
				resJson.put("errorInfo", "保存文件失败");
				return resJson.toString();
			}
			// 写入数据库
			int m_FileSize = fileData.length / 1024;
			exchangeService.SaveFileInfo(arcCode, eleId, m_FileName, m_SubDir, creater, m_FileSize, m_FileIndex);
			resJson.put("errorCode", SUCC_CODE);
			resJson.put("errorInfo", SUCC_INFO);
			return resJson.toString();
		} catch (Exception ex) {
			errorInfo = String.format("发生异常，信息:%s", ex.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, ex);
			resJson.put("errorCode", resMap.get("errorCode"));
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
	}

	@Override
	public String GetPkgElements(String arcCode) {
		Map<String, Object> resMap = exchangeService.GetPkgElement(arcCode);
		return JSONObject.fromObject(resMap).toString();
	}

	@Override
	public String GetPkgElmentsToJson(String json) {
		JSONObject jsonObj = JSONObject.fromObject(json);
		String m_ArcCode = jsonObj.getString("ArcCode");
		return GetPkgElements(m_ArcCode);
	}

	@SuppressWarnings("unchecked")
	@Override
	public String GetPicByPkgCodeEleId(String arcCode, int eleId) {
		resJson = new JSONObject();
		String errorInfo = null;
		Map<String, Object> resMap = exchangeService.GetPicByPkgCodeEleId(arcCode, eleId);
		if (StringUtils.isNotBlank(errorInfo = exchangeService.getErrorMsg())) {
			resJson.put("errorCode", resMap.get("errorCode"));
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		List<Map<String, Object>> dataMaps = (List<Map<String, Object>>) resMap.get("content");
		String fullPath = null;
		List<Map<String, Object>> content = new ArrayList<Map<String, Object>>();
		if (dataMaps != null && dataMaps.size() > 0) {
			byte[] temp = null;
			for (Map<String, Object> dataMap : dataMaps) {
				temp = new byte[] {};
				fullPath = (String) dataMap.get("SLFULLPATH");
				try {
					temp = readerService.ReadFile(fullPath);
				} catch (Exception e) {
					errorInfo = String.format("读取文件发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
					log.error(errorInfo, e);
					resJson.put("errorCode", ERR_CODE);
					resJson.put("errorInfo", errorInfo);
					return resJson.toString();
				}
				dataMap.put("FILEINFO", Encodes.encodeBase64(temp));
				content.add(dataMap);
			}
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		resJson.put("content", content);
		return resJson.toString();
	}

	@Override
	public String GetPicByPkgCodeEleIdToJson(String json) {
		resJson = new JSONObject();
		String errorInfo = null;
		JSONObject jsonObj = JSONObject.fromObject(json);
		String arcCode = jsonObj.getString("ArcCode");
		Integer eleId = 0;
		try {
			eleId = Integer.parseInt(jsonObj.getString("EleId"));
		} catch (NumberFormatException e) {
			errorInfo = String.format("参数转换异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		return GetPicByPkgCodeEleId(arcCode, eleId);
	}

	@Override
	public String GetPicByPathToJson(String json) {
		resJson = new JSONObject();
		String errorInfo = null;
		JSONObject jsonObj = JSONObject.fromObject(json);
		String path = jsonObj.getString("Path");
		byte[] temp = null;
		temp = new byte[] {};
		try {
			temp = readerService.ReadFile(path);
		} catch (Exception e) {
			errorInfo = String.format("读取文件发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, e);
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		resJson.put("content", Encodes.encodeBase64(temp));
		return resJson.toString();
	}

	@Override
	public String DelContent(String arcCode, int eleId, String fileName) {
		resJson = new JSONObject();
		String errorInfo = null;
		try {
			exchangeService.DelContent(arcCode, eleId, fileName);
		} catch (Exception e) {
			errorInfo = String.format("删除文件发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, e);
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		return resJson.toString();
	}

	@Override
	public String DelContentJson(String json) {
		resJson = new JSONObject();
		String errorInfo = null;
		JSONObject jsonObj = JSONObject.fromObject(json);
		String arcCode = jsonObj.getString("ArcCode");
		Integer eleId = 0;
		String fileName = jsonObj.getString("FileName");
		try {
			eleId = Integer.parseInt(jsonObj.getString("EleId"));
		} catch (NumberFormatException e) {
			errorInfo = String.format("EleId参数转换异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		return DelContent(arcCode, eleId, fileName);
	}

	@Override
	public String ChangeFileIndex(String arcCode, int eleId, int preIndex, int curIndex, String fileName) {
		resJson = new JSONObject();
		String errorInfo = null;
		try {
			exchangeService.ChangeFileIndex(arcCode, eleId, preIndex, curIndex, fileName);
		} catch (Exception e) {
			errorInfo = String.format("修改图片顺序发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, e);
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		return resJson.toString();
	}

	@Override
	public String ChangeFileIndexJson(String json) {
		resJson = new JSONObject();
		String errorInfo = null;
		JSONObject jsonObj = JSONObject.fromObject(json);
		String arcCode = jsonObj.getString("ArcCode");
		Integer eleId = 0;
		Integer preIndex = 0;
		Integer curIndex = 0;
		String fileName = jsonObj.getString("FileName");
		try {
			eleId = Integer.parseInt(jsonObj.getString("EleId"));
			preIndex = Integer.parseInt(jsonObj.getString("preIndex"));
			curIndex = Integer.parseInt(jsonObj.getString("curIndex"));
		} catch (NumberFormatException e) {
			errorInfo = String.format("参数转换异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		return ChangeFileIndex(arcCode, eleId, preIndex, curIndex, fileName);
	}

	@Override
	public String UpdateFileInfo(String arcCode, int eleId, String fileName, String descript, String keyWord) {
		String errorInfo = null;
		resJson = new JSONObject();
		try {
			exchangeService.UpdateFileInfo(arcCode, eleId, fileName, descript, keyWord);
		} catch (Exception e) {
			errorInfo = String.format("修改文件信息发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, e);
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		return resJson.toString();
	}

	@Override
	public String UpdateFileInfoJson(String json) {
		resJson = new JSONObject();
		String errorInfo = null;
		JSONObject jsonObj = JSONObject.fromObject(json);
		String arcCode = jsonObj.getString("ArcCode");
		Integer eleId = 0;
		String fileName = jsonObj.getString("FileName");
		String descript = jsonObj.getString("Descript");
		String keyWord = jsonObj.getString("KeyWord");
		try {
			eleId = Integer.parseInt(jsonObj.getString("EleId"));
		} catch (NumberFormatException e) {
			errorInfo = String.format("EleId参数转换异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		return UpdateFileInfo(arcCode, eleId, fileName, descript, keyWord);
	}

	@Override
	public String UpdateArchiveInfo(String arcCode, String owner, String keyWord, String title, String descript) {
		String errorInfo = null;
		resJson = new JSONObject();
		try {
			exchangeService.UpdateArchiveInfo(arcCode, owner, keyWord, title, descript);
		} catch (Exception e) {
			errorInfo = String.format("修改档案信息发生异常，信息:%s", e.getMessage()).replace("\r\n", "").replace("'", "");
			log.error(errorInfo, e);
			resJson.put("errorCode", ERR_CODE);
			resJson.put("errorInfo", errorInfo);
			return resJson.toString();
		}
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		return resJson.toString();
	}

	@Override
	public String UpdateArchiveInfoJson(String json) {
		JSONObject jsonObj = JSONObject.fromObject(json);
		String arcCode = jsonObj.getString("ArcCode");
		String owner = jsonObj.getString("Owner");
		String title = jsonObj.getString("Title");
		String descript = jsonObj.getString("Descript");
		String keyWord = jsonObj.getString("KeyWord");
		return UpdateArchiveInfo(arcCode, owner, keyWord, title, descript);
	}

}
