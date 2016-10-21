package com.sundsoft.service.dasExchange.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.mapper.dasExchange.ExchangeMapper;
import com.sundsoft.service.dasExchange.IExchangeService;

@Service
public class ExchangeServiceImpl implements IExchangeService {

	@Autowired
	private ExchangeMapper exchangeMapper;

	private String m_Errmsg = ""; // 记录错误信息
	private int m_iRet = 0; // 查询影响行数
	public String ErrorMsg;

	private Map<String, Object> params = null;

	private static final String SUCC_CODE = "00000";

	private static final String ERR_CODE = "-1";

	@Override
	public String getErrorMsg() {
		String m_STemp = m_Errmsg;
		m_STemp = m_STemp.replace("\r", "");
		m_STemp = m_STemp.replace("\n", "");
		m_STemp = m_STemp.replace("'", "");
		m_STemp = m_STemp.replace("\"", "");
		return m_STemp;
	}

	@Override
	public Map<String, Object> CreateDaPackage(String pkgcode, String owner, String keyword, String creater,
			String title, String script, String directory) {
		params = new HashMap<String, Object>();
		params.put("pkgcode", pkgcode);
		params.put("clsid", pkgcode.split("\\.")[1]);
		params.put("owner", owner);
		params.put("keyword", keyword);
		params.put("creater", creater);
		params.put("title", title);
		params.put("script", script);
		params.put("directory", directory);
		try {
			exchangeMapper.CreateDaPackage(params);
			params.put("RtnCode", SUCC_CODE);
			params.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			params.put("RtnCode", ERR_CODE);
			params.put("RtnMsg", getErrorMsg());
		}
		return params;
	}

	@Override
	public Map<String, Object> GetFileDicInfo(String arcCode, int eleId) {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		try {
			exchangeMapper.GetFileDicInfo(params);
			params.put("RtnCode", SUCC_CODE);
			params.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			params.put("RtnCode", ERR_CODE);
			params.put("RtnMsg", getErrorMsg());
		}
		return params;
	}

	@Override
	public void SaveFileInfo(String arcCode, int eleId, String fileName, String subdir, String creater, int fileSize,
			int fileIndex) throws Exception {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		params.put("fileName", fileName);
		params.put("subdir", subdir);
		params.put("creater", creater);
		params.put("fileSize", fileSize);
		params.put("fileIndex", fileIndex);
		params.put("slFileName", fileName.replace(".jpg", "sl.jpg"));
		exchangeMapper.SaveFileInfo(params);
	}

	@Override
	public Map<String, Object> GetPkgElement(String arcCode) {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		try {
			exchangeMapper.GetPkgElement(params);
			params.put("RtnCode", SUCC_CODE);
			params.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			params.put("RtnCode", ERR_CODE);
			params.put("RtnMsg", getErrorMsg());
		}
		return params;
	}

	@Override
	public Map<String, Object> GetPicByPkgCodeEleId(String arcCode, int eleId) {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		try {
			exchangeMapper.GetPicByPkgCodeEleId(params);
			params.put("RtnCode", SUCC_CODE);
			params.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			params.put("RtnCode", ERR_CODE);
			params.put("RtnMsg", getErrorMsg());
		}
		return params;
	}

	@Override
	public void DelContent(String arcCode, int eleId, String fileName) throws Exception {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		params.put("fileName", fileName);
		exchangeMapper.DelContent(params);
	}

	@Override
	public void ChangeFileIndex(String arcCode, int eleId, int preIndex, int curIndex, String fileName)
			throws Exception {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		params.put("preIndex", preIndex);
		params.put("curIndex", curIndex);
		params.put("fileName", fileName);
		exchangeMapper.ChangeFileIndex(params);

	}

	@Override
	public void UpdateFileInfo(String arcCode, int eleId, String fileName, String descript, String keyWord)
			throws Exception {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("eleId", eleId);
		params.put("fileName", fileName);
		params.put("descript", descript);
		params.put("keyWord", keyWord);
		exchangeMapper.UpdateFileInfo(params);

	}

	@Override
	public void UpdateArchiveInfo(String arcCode, String owner, String keyWord, String title, String descript)
			throws Exception {
		params = new HashMap<String, Object>();
		params.put("arcCode", arcCode);
		params.put("owner", owner);
		params.put("keyWord", keyWord);
		params.put("title", title);
		params.put("descript", descript);
		exchangeMapper.UpdateArchiveInfo(params);
	}

}
