package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.DWJCDJXXBGMapper;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_ZxshModel;
import com.sundsoft.service.gjExchange.IGj_DWJCDJXXBGService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_DWJCDJXXBGServiceImpl implements IGj_DWJCDJXXBGService {

	@Autowired
	private DWJCDJXXBGMapper dWJCDJXXBGMapper;
	private static final Logger log = LogManager.getLogger(Gj_DWJCDJXXBGServiceImpl.class);

	@Override
	public Map<String, Object> GJ_DWJCDJXXBGGETLIST(DWJCDJXXBG_GetlistModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJXXBGMapper.GJ_DWJCDJXXBGGETLIST(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJXXBGZXSH(DWJCDJXXBG_ZxshModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJXXBGMapper.GJ_DWJCDJXXBGZXSH(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJXXBGYYBL(DWJCDJXXBG_YyblModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJXXBGMapper.GJ_DWJCDJXXBGYYBL(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> GJ_DWJCDJXXBGGETBYID(DWJCDJXXBG_GetbyidModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJXXBGMapper.GJ_DWJCDJXXBGGETBYID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public String GJ_DWJCDJXXBGAceept(DWJCDJXXBG_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			dWJCDJXXBGMapper.GJ_DWJCDJXXBGAceept(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
