package com.sundsoft.service.dkExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.dkExchange.DkMapper;
import com.sundsoft.model.in.dk.V5_AceeptModel;
import com.sundsoft.model.in.dk.V5_DocsviewModel;
import com.sundsoft.model.in.dk.V5_GetbyidModel;
import com.sundsoft.model.in.dk.V5_GetdocsbyidModel;
import com.sundsoft.model.in.dk.V5_GetlistModel;
import com.sundsoft.model.in.dk.V5_YyblModel;
import com.sundsoft.model.in.dk.V5_ZxshModel;
import com.sundsoft.service.dkExchange.IDkService;
import com.sundsoft.utils.BeanToMapUtil;

@Service
public class DkServiceImpl implements IDkService {

	@Autowired
	private DkMapper dkMapper;
	
	private static final Logger log = LogManager.getLogger(DkServiceImpl.class);

	@Override
	public Map<String, Object> DK_V5DKSLGETLIST(V5_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String DK_V5DKSLZXSH(V5_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String DK_V5DKSLYYBL(V5_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> DK_V5DKSLGETBYID(V5_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String DK_V5DKSLAceept(V5_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLAceept(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> DK_V5DKSLGetDocsViewList(V5_DocsviewModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLGetDocsViewList(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> DK_V5DKSLGetDocsByID(V5_GetdocsbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dkMapper.DK_V5DKSLGetDocsByID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
