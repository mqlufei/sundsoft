package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.JCBLTZMapper;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_YyblModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_JCBLTZService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_JCBLTZServiceImpl implements IGj_JCBLTZService {

	@Autowired
	private JCBLTZMapper jCBLTZMapper;
	private static final Logger log = LogManager.getLogger(Gj_JCBLTZServiceImpl.class);

	@Override
	public Map<String, Object> GJ_JCBLTZGETLIST(JCBLTZ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jCBLTZMapper.GJ_JCBLTZGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCBLTZZXSH(JCBLTZ_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jCBLTZMapper.GJ_JCBLTZZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCBLTZYYBL(JCBLTZ_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jCBLTZMapper.GJ_JCBLTZYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_JCBLTZGETBYID(JCBLTZ_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jCBLTZMapper.GJ_JCBLTZGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_JCBLTZACEEPT(JCBLTZ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			jCBLTZMapper.GJ_JCBLTZACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
