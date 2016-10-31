package com.sundsoft.webservice.xxExchange.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.service.xxExchange.IXxExchange;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.xxExchange.IXxExchangeService;


public class XxExchangeServiceImpl implements IXxExchangeService {
	
	private static final Logger log = LogManager.getLogger(XxExchangeServiceImpl.class);
	
	@Autowired
	private IXxExchange xxService;

	@Override
	public String XX_SAVESMS(int P_GJJZXID, String P_YWJKMC, String P_DHHM, String P_DXNR) {
		try {
			return xxService.XX_SAVESMS(P_GJJZXID, P_YWJKMC, P_DHHM, P_DXNR);
		}
		catch (ServiceException e) {
			log.error(e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

}
