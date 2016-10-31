package com.sundsoft.service.crmExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.crmExchange.DwqudjMapper;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_DelModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetbyidModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetlistdwModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GxjbrxxModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_NewpwdModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_SaveModel;
import com.sundsoft.service.crmExchange.ICrm_DwqudjService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Crm_DwqudjServiceImpl implements ICrm_DwqudjService {

	@Autowired
	private DwqudjMapper dwqudjMapper;
	private static final Logger log = LogManager.getLogger(Crm_DwqudjServiceImpl.class);

	@Override
	public Map<String, Object> CRM_QY_DWQYLIST(DWQUDJ_GetlistdwModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_QY_DWQYLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_QY_DWQY(DWQUDJ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_QY_DWQY(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_SAVEDWZL(DWQUDJ_SaveModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_SAVEDWZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> CRM_GETDWZL(DWQUDJ_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_GETDWZL(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_DELDWZL(DWQUDJ_DelModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_DELDWZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_DWZLNEWPWD(DWQUDJ_NewpwdModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_DWZLNEWPWD(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_DWZLXGJBRZL(DWQUDJ_GxjbrxxModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = dwqudjMapper.CRM_DWZLXGJBRZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
