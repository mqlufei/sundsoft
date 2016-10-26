package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.GRZHTCZYMapper;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_GRZHTCZYService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_GRZHTCZYServiceImpl implements IGj_GRZHTCZYService {

	@Autowired
	private GRZHTCZYMapper gRZHTCZYMapper;
	private static final Logger log = LogManager.getLogger(Gj_GRZHTCZYServiceImpl.class);

	@Override
	public Map<String, Object> GJ_GRZHTCZYGETLIST(GRZHTCZY_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GRZHTCZYZXSH(GRZHTCZY_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GRZHTCZYYYBL(GRZHTCZY_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_GRZHTCZYGETMXLIST(GRZHTCZY_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GRZHTCZYGETBYDWZH(GRZHTCZY_GetbydwzhModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYGETBYDWZH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GRZHTCZYACEEPT(GRZHTCZY_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = gRZHTCZYMapper.GJ_GRZHTCZYACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
