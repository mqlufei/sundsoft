package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.DWJCDJMapper;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_DWJCDJService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_DWJCDJServiceImpl implements IGj_DWJCDJService {

	@Autowired
	private DWJCDJMapper dWJCDJMapper;
	private static final Logger log = LogManager.getLogger(Gj_DWJCDJServiceImpl.class);

	@Override
	public Map<String, Object> GJ_DWJCDJGETLIST(DWJCDJ_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJMapper.GJ_DWJCDJGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJZXSH(DWJCDJ_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJMapper.GJ_DWJCDJZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJYYBL(DWJCDJ_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJMapper.GJ_DWJCDJYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_DWJCDJGETBYID(DWJCDJ_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJMapper.GJ_DWJCDJGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJACEEPT(DWJCDJ_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJMapper.GJ_DWJCDJACEEPT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
