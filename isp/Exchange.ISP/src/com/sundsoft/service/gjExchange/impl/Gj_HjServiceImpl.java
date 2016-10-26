package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.HjMapper;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetfcqflistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetgrzhsllistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjaymxModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzjbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzlbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetjcjstzlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_HjaceeptzlModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortofcqfModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortogrzhslModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortojcjstzModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_YyblModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_HjService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_HjServiceImpl implements IGj_HjService {

	@Autowired
	private HjMapper hjMapper;
	private static final Logger log = LogManager.getLogger(Gj_HjServiceImpl.class);

	@Override
	public Map<String, Object> GJ_HJGETLIST(HJ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJZXSH(HJ_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJYYBL(HJ_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETHJMXLIST(HJ_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETHJMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETGRZHSLLIST(HJ_GetgrzhsllistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETGRZHSLLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETJCJSTZLIST(HJ_GetjcjstzlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETJCJSTZLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETFCQFLIST(HJ_GetfcqflistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETFCQFLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETAYMXLIST(HJ_GethjaymxModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETAYMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETHJZLBYYWID(HJ_GethjzlbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETHJZLBYYWID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJSaveErrorToGRZHSL(HJ_SaveerrortogrzhslModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJSaveErrorToGRZHSL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJSaveErrorToJCJSTZ(HJ_SaveerrortojcjstzModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJSaveErrorToJCJSTZ(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJSaveErrorToFCQF(HJ_SaveerrortofcqfModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJSaveErrorToFCQF(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_HJAceeptZL(HJ_HjaceeptzlModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJAceeptZL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_HJGETHJZJBYID(HJ_GethjzjbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = hjMapper.GJ_HJGETHJZJBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
