package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.BjMapper;
import com.sundsoft.model.in.gj.slgjbj.BJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_YyblModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_BjService;
import com.sundsoft.utils.BeanToMapUtil;

@Service
public class Gj_BjServiceImpl implements IGj_BjService {

	@Autowired
	private BjMapper bjMapper;

	private static final Logger log = LogManager.getLogger(Gj_BjServiceImpl.class);

	@Override
	public Map<String, Object> GJ_BJGETLIST(BJ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_BJZXSH(BJ_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJGETLIST(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_BJYYBL(BJ_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_BJGETMXLIST(BJ_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_BJAceept(BJ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJAceept(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_BJGETBYID(BJ_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			bjMapper.GJ_BJGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
