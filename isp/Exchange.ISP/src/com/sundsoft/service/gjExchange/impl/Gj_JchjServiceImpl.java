package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.JchjMapper;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_YyblModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_JchjService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_JchjServiceImpl implements IGj_JchjService {

	@Autowired
	private JchjMapper jchjMapper;
	private static final Logger log = LogManager.getLogger(Gj_JchjServiceImpl.class);

	@Override
	public Map<String, Object> GJ_JCHJGETLIST(JCHJ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jchjMapper.GJ_JCHJGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCHJZXSH(JCHJ_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jchjMapper.GJ_JCHJZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCHJYYBL(JCHJ_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jchjMapper.GJ_JCHJYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_JCHJGETBYID(JCHJ_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jchjMapper.GJ_JCHJGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCHJACEEPT(JCHJ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jchjMapper.GJ_JCHJACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
