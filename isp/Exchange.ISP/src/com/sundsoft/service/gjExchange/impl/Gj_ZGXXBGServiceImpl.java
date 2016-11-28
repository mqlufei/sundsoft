package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.ZGXXBGMapper;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_ZGXXBGService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_ZGXXBGServiceImpl implements IGj_ZGXXBGService {

	@Autowired
	private ZGXXBGMapper zGXXBGMapper;
	private static final Logger log = LogManager.getLogger(Gj_ZGXXBGServiceImpl.class);

	@Override
	public Map<String, Object> GJ_ZGXXBGGETLIST(ZGXXBG_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_ZGXXBGZXSH(ZGXXBG_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_ZGXXBGYYBL(ZGXXBG_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_ZGXXBGGETMXLIST(ZGXXBG_GetmxlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGGETMXLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_ZGXXBGGETBYDWZH(ZGXXBG_GetbydwzhModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGGETBYDWZH(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_ZGXXBGACEEPT(ZGXXBG_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			zGXXBGMapper.GJ_ZGXXBGACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
