package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.GJJYDZYMapper;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_GJJYDZYService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_GJJYDZYServiceImpl implements IGj_GJJYDZYService {

	@Autowired
	private GJJYDZYMapper gJJYDZYMapper;
	private static final Logger log = LogManager.getLogger(Gj_GJJYDZYServiceImpl.class);

	@Override
	public Map<String, Object> GJ_GJJYDZYGETLIST(GJJYDZY_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GJJYDZYZXSH(GJJYDZY_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GJJYDZYYYBL(GJJYDZY_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_GJJYDZYGETMXLIST(GJJYDZY_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_GJJYDZYGETBYDWZH(GJJYDZY_GetbydwzhModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYGETBYDWZH(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_GJJYDZYACEEPT(GJJYDZY_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			gJJYDZYMapper.GJ_GJJYDZYACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
