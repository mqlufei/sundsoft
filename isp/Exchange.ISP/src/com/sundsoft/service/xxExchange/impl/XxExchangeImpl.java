package com.sundsoft.service.xxExchange.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.xxExchange.XxMapper;
import com.sundsoft.service.xxExchange.IXxExchange;

@Service
public class XxExchangeImpl implements IXxExchange{
	
	private static final Logger log = LogManager.getLogger(XxExchangeImpl.class);
	
	@Autowired
	private XxMapper xxMapper;
	
	@Override
	public String XX_SAVESMS(int P_GJJZXID, String P_YWJKMC, String P_DHHM, String P_DXNR) throws ServiceException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("gjjzxid", P_GJJZXID);
		params.put("ywjkmc", P_YWJKMC);
		params.put("dhhm", P_DHHM);
		params.put("dxnr", P_DXNR);
		try {
			xxMapper.XX_SAVESMS(params);
			return params.get("Out_Msg") == null ? "" : params.get("Out_Msg").toString();
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
