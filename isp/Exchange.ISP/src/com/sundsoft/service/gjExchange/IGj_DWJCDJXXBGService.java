package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetbyidModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjdwjcdjxxbg.DWJCDJXXBG_ZxshModel;

public interface IGj_DWJCDJXXBGService {

	public Map<String, Object> GJ_DWJCDJXXBGGETLIST(DWJCDJXXBG_GetlistModel model) throws ServiceException;

	public String GJ_DWJCDJXXBGZXSH(DWJCDJXXBG_ZxshModel model)  throws ServiceException;

	public String GJ_DWJCDJXXBGYYBL(DWJCDJXXBG_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_DWJCDJXXBGGETBYID(DWJCDJXXBG_GetbyidModel model) throws ServiceException;

	public String GJ_DWJCDJXXBGAceept(DWJCDJXXBG_AceeptModel model) throws ServiceException;

}
