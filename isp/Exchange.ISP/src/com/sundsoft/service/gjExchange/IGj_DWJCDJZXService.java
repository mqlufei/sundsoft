package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjzx.DWJCDJZX_ZxshModel;

public interface IGj_DWJCDJZXService {

	public Map<String, Object> GJ_DWJCDJZXGETLIST(DWJCDJZX_GetlistModel model) throws ServiceException;

	public String GJ_DWJCDJZXZXSH(DWJCDJZX_ZxshModel model) throws ServiceException;

	public String GJ_DWJCDJZXYYBL(DWJCDJZX_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_DWJCDJZXGETBYID(DWJCDJZX_GetbyidModel model)throws ServiceException;

	public Map<String, Object> GJ_DWJCDJZXAceept(DWJCDJZX_AceeptModel model)throws ServiceException;
	
}
