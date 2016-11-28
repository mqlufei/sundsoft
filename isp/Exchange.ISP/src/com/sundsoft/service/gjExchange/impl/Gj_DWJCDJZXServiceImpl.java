package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.DWJCDJZXMapper;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_DWJCDJZXService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_DWJCDJZXServiceImpl implements IGj_DWJCDJZXService {

	@Autowired
	private DWJCDJZXMapper dWJCDJZXMapper;
	private static final Logger log = LogManager.getLogger(Gj_DWJCDJZXServiceImpl.class);

	@Override
	public Map<String, Object> GJ_DWJCDJZXGETLIST(DWJCDJZX_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJZXMapper.GJ_DWJCDJZXGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJZXZXSH(DWJCDJZX_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJZXMapper.GJ_DWJCDJZXZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJZXYYBL(DWJCDJZX_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJZXMapper.GJ_DWJCDJZXYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_DWJCDJZXGETBYID(DWJCDJZX_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJZXMapper.GJ_DWJCDJZXGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_DWJCDJZXAceept(DWJCDJZX_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJZXMapper.GJ_DWJCDJZXAceept(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
