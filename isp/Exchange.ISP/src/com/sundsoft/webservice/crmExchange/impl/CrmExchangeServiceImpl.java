package com.sundsoft.webservice.crmExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_DelModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetbyidModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetlistdwModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GxjbrxxModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_NewpwdModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_SaveModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_GetlistModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_SaveModel;
import com.sundsoft.service.crmExchange.ICrm_DwService;
import com.sundsoft.service.crmExchange.ICrm_DwqudjService;
import com.sundsoft.service.crmExchange.ICrm_GrqudjService;
import com.sundsoft.utils.BeanToMapUtil;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.crmExchange.ICrmExchangeService;

import net.sf.json.JSONObject;

public class CrmExchangeServiceImpl implements ICrmExchangeService {

	private static final Logger log = LogManager.getLogger(CrmExchangeServiceImpl.class);
	
	private JSONObject jsonObj = null;
	
	@Autowired
	private ICrm_GrqudjService grqudjService;
	
	@Autowired
	private ICrm_DwqudjService dwqudjService ;
	
	@Autowired
	private ICrm_DwService dwService;
	

	@Override
	public String SL_CRM_GRQUDJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLIST":
			try {
				GRQUDJ_GetlistModel model = null;
				model = (GRQUDJ_GetlistModel) BeanToMapUtil.convertJson(GRQUDJ_GetlistModel.class, jsonObj);
				Map<String, Object> res = grqudjService.CRM_QY_GETGRZLLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				GRQUDJ_AceeptModel model = null;
				model = (GRQUDJ_AceeptModel) BeanToMapUtil.convertJson(GRQUDJ_AceeptModel.class, jsonObj);
				String res = grqudjService.CRM_QY_GRZL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "Save":
			try {
				GRQUDJ_SaveModel model = null;
				model = (GRQUDJ_SaveModel) BeanToMapUtil.convertJson(GRQUDJ_SaveModel.class, jsonObj);
				String res = grqudjService.CRM_SAVEGRZL(model);
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
	public String SL_CRM_DWQUDJ(String p_Data) {
		jsonObj = JSONObject.fromObject(p_Data);
		String optType = jsonObj.getString("CZLX");
		switch (optType) {
		case "GETLISTDW":
			try {
				DWQUDJ_GetlistdwModel model = null;
				model = (DWQUDJ_GetlistdwModel) BeanToMapUtil.convertJson(DWQUDJ_GetlistdwModel.class, jsonObj);
				Map<String, Object> res = dwqudjService.CRM_QY_DWQYLIST(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "ACEEPT":
			try {
				DWQUDJ_AceeptModel model = null;
				model = (DWQUDJ_AceeptModel) BeanToMapUtil.convertJson(DWQUDJ_AceeptModel.class, jsonObj);
				String res = dwqudjService.CRM_QY_DWQY(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "Save":
			try {
				DWQUDJ_SaveModel model = null;
				model = (DWQUDJ_SaveModel) BeanToMapUtil.convertJson(DWQUDJ_SaveModel.class, jsonObj);
				String res = dwqudjService.CRM_SAVEDWZL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GETBYID":
			try {
				DWQUDJ_GetbyidModel model = null;
				model = (DWQUDJ_GetbyidModel) BeanToMapUtil.convertJson(DWQUDJ_GetbyidModel.class, jsonObj);
				Map<String, Object> res = dwqudjService.CRM_GETDWZL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "DEL":
			try {
				DWQUDJ_DelModel model = null;
				model = (DWQUDJ_DelModel) BeanToMapUtil.convertJson(DWQUDJ_DelModel.class, jsonObj);
				String res = dwqudjService.CRM_DELDWZL(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "NEWPWD":
			try {
				DWQUDJ_NewpwdModel model = null;
				model = (DWQUDJ_NewpwdModel) BeanToMapUtil.convertJson(DWQUDJ_NewpwdModel.class, jsonObj);
				String res = dwqudjService.CRM_DWZLNEWPWD(model);
				return ResponseUtil.succ(res);
			}
			catch (ServiceException e) {
				return ResponseUtil.err(e.getErrCode(), e.getMessage());
			}

		case "GXJBRXX":
			try {
				DWQUDJ_GxjbrxxModel model = null;
				model = (DWQUDJ_GxjbrxxModel) BeanToMapUtil.convertJson(DWQUDJ_GxjbrxxModel.class, jsonObj);
				String res = dwqudjService.CRM_DWZLXGJBRZL(model);
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
	public String SL_CRM_DWRZ(String crmNum, String rzfs, byte[] rzyx) {
		try {
			String res = dwService.ZXWDDT(crmNum, rzfs, rzyx);
			return ResponseUtil.succ(res);
		}
		catch (ServiceException e) {
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}

	}

	@Override
	public byte[] SL_CRM_DWRZYX(String crmNum) {
		String typeId = "1";
		try {
			Map<String, Object>  res = dwService.CRM_GETDWZL(crmNum,typeId);
			return (byte[])res.get("RZYX");
		}
		catch (ServiceException e) {
			log.error(e);
			return null;
		}
	}

}
