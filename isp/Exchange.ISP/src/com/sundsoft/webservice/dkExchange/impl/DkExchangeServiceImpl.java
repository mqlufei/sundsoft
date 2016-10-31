package com.sundsoft.webservice.dkExchange.impl;

import java.util.Map;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.cache.CustomizedPropertyConfigurer;
import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.dk.V5_AceeptModel;
import com.sundsoft.model.in.dk.V5_DocsviewModel;
import com.sundsoft.model.in.dk.V5_GetbyidModel;
import com.sundsoft.model.in.dk.V5_GetdocsbyidModel;
import com.sundsoft.model.in.dk.V5_GetlistModel;
import com.sundsoft.model.in.dk.V5_YyblModel;
import com.sundsoft.model.in.dk.V5_ZxshModel;
import com.sundsoft.service.dkExchange.IDkService;
import com.sundsoft.utils.BeanToMapUtil;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.IDocTransServices;
import com.sundsoft.webservice.dkExchange.IDkExchangeService;

import net.sf.json.JSONObject;

public class DkExchangeServiceImpl implements IDkExchangeService {

	private static final Logger log = LogManager.getLogger(DkExchangeServiceImpl.class);

	private JSONObject jsonObj = null;

	@Autowired
	private IDkService dkService;
	
	private static IDocTransServices readerService = null;
	static {

		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		factoryBean.setServiceClass(IDocTransServices.class);
		factoryBean.setAddress(CustomizedPropertyConfigurer.getContextProperty("trans.webservice.url").toString());

		readerService = (IDocTransServices) factoryBean.create();
	}

	@Override
	public String SL_DK_DKSL_V5(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				V5_GetlistModel model = null;
				model = (V5_GetlistModel) BeanToMapUtil.convertJson(V5_GetlistModel.class, jsonObj);
				Map<String, Object> res = dkService.DK_V5DKSLGETLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ZXSH":
			try {
				V5_ZxshModel model = null;
				model = (V5_ZxshModel) BeanToMapUtil.convertJson(V5_ZxshModel.class, jsonObj);
				String res = dkService.DK_V5DKSLZXSH(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "YYBL":
			try {
				V5_YyblModel model = null;
				model = (V5_YyblModel) BeanToMapUtil.convertJson(V5_YyblModel.class, jsonObj);
				String res = dkService.DK_V5DKSLYYBL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				V5_GetbyidModel model = null;
				model = (V5_GetbyidModel) BeanToMapUtil.convertJson(V5_GetbyidModel.class, jsonObj);
				Map<String, Object> res = dkService.DK_V5DKSLGETBYID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				V5_AceeptModel model = null;
				model = (V5_AceeptModel) BeanToMapUtil.convertJson(V5_AceeptModel.class, jsonObj);
				String res = dkService.DK_V5DKSLAceept(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "DOCSVIEW":
			try {
				V5_DocsviewModel model = null;
				model = (V5_DocsviewModel) BeanToMapUtil.convertJson(V5_DocsviewModel.class, jsonObj);
				Map<String, Object> res = dkService.DK_V5DKSLGetDocsViewList(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETDOCSBYID":
			try {
				V5_GetdocsbyidModel model = null;
				model = (V5_GetdocsbyidModel) BeanToMapUtil.convertJson(V5_GetdocsbyidModel.class, jsonObj);
				Map<String, Object> res = dkService.DK_V5DKSLGetDocsByID(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		default:
			return ResponseUtil.err(ServiceErrorCode.INTERFACE_ERROR.getErrorCode(), ServiceErrorCode.INTERFACE_ERROR.getDefaultMessage());
		}
	}
	
	@Override
	public byte[] Isp_GetDocFile(String p_PathFile) {
		try {
			return readerService.ReadFile(p_PathFile);
		}
		catch (Exception e) {
			log.error("获取文件数据失败:",e);
			return null;
		}
		
	}
}
