package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.LHJYRYJCMapper;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_AceeptModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetbyidModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_YyblModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_LHJYRYJCService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_LHJYRYJCServiceImpl implements IGj_LHJYRYJCService {

	@Autowired
	private LHJYRYJCMapper lHJYRYJCMapper;
	private static final Logger log = LogManager.getLogger(Gj_LHJYRYJCServiceImpl.class);

	@Override
	public Map<String, Object> GJ_LHJYRYJCGETLIST(LHJYRYJC_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_LHJYRYJCZXSH(LHJYRYJC_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_LHJYRYJCYYBL(LHJYRYJC_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_LHJYRYJCGETMXLIST(LHJYRYJC_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_LHJYRYJCACEEPT(LHJYRYJC_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_LHJYRYJCGETBYID(LHJYRYJC_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = lHJYRYJCMapper.GJ_LHJYRYJCGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
