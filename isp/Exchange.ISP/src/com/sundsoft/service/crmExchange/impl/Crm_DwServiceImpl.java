package com.sundsoft.service.crmExchange.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.crmExchange.DwMapper;
import com.sundsoft.service.crmExchange.ICrm_DwService;
@Service
public class Crm_DwServiceImpl implements ICrm_DwService {

	@Autowired
	private DwMapper dwMapper;
	private static final Logger log = LogManager.getLogger(Crm_DwServiceImpl.class);

	@Override
	public String ZXWDDT(String crmNum, String rzfs, byte[] rzyx) throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("crmNum", crmNum);
			params.put("rzfs", rzfs);
			params.put("rzyx", rzyx);
			params = dwMapper.ZXWDDT(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> CRM_GETDWZL(String crmNum, String typeId) throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("crmNum", crmNum);
			params.put("typeId", typeId);
			params = dwMapper.CRM_GETDWZL(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
