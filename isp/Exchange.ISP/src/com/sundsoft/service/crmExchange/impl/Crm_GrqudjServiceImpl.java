package com.sundsoft.service.crmExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.crmExchange.GrqudjMapper;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_GetlistModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_SaveModel;
import com.sundsoft.service.crmExchange.ICrm_GrqudjService;
import com.sundsoft.utils.BeanToMapUtil;

@Service
public class Crm_GrqudjServiceImpl implements ICrm_GrqudjService {

	@Autowired
	private GrqudjMapper grqudjMapper;
	private static final Logger log = LogManager.getLogger(Crm_GrqudjServiceImpl.class);

	@Override
	public Map<String, Object> CRM_QY_GETGRZLLIST(GRQUDJ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			grqudjMapper.CRM_QY_GETGRZLLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_QY_GRZL(GRQUDJ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			grqudjMapper.CRM_QY_GRZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String CRM_SAVEGRZL(GRQUDJ_SaveModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			grqudjMapper.CRM_SAVEGRZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
