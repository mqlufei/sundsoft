package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdj.DWJCDJ_ZxshModel;

public interface IGj_DWJCDJService {

	public Map<String, Object> GJ_DWJCDJGETLIST(DWJCDJ_GetlistModel model) throws ServiceException;

	public String GJ_DWJCDJZXSH(DWJCDJ_ZxshModel model) throws ServiceException;

	public String GJ_DWJCDJYYBL(DWJCDJ_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_DWJCDJGETBYID(DWJCDJ_GetbyidModel model) throws ServiceException;

	public String GJ_DWJCDJACEEPT(DWJCDJ_AceeptModel model) throws ServiceException;

}
