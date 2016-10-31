package com.sundsoft.service.crmExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;

public interface ICrm_DwService {
	
	public String ZXWDDT(String crmNum, String rzfs, byte[] rzyx) throws ServiceException;

	public Map<String,Object> CRM_GETDWZL(String crmNum,String typeId) throws ServiceException;

}
