package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.YWSLMapper;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_AceeptModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetzxbyidModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_YyblModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_YWSLService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_YWSLServiceImpl implements IGj_YWSLService {

	@Autowired
	private YWSLMapper yWSLMapper;
	private static final Logger log = LogManager.getLogger(Gj_YWSLServiceImpl.class);

	@Override
	public Map<String, Object> GJ_YWSLGETLIST(YWSL_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_YWSLZXSH(YWSL_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_YWSLYYBL(YWSL_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_YWSLGETMXLIST(YWSL_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_YWSLGETBYDWZH(YWSL_GetbydwzhModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLGETBYDWZH(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_YWSLACEEPT(YWSL_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_YWSLGETZXBYID(YWSL_GetzxbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			yWSLMapper.GJ_YWSLGETZXBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
