package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_YyblModel;
import com.sundsoft.model.in.gj.slgjjcbltz.JCBLTZ_ZxshModel;

public interface IGj_JCBLTZService {

	public Map<String, Object> GJ_JCBLTZGETLIST(JCBLTZ_GetlistModel model) throws ServiceException;

	public String GJ_JCBLTZZXSH(JCBLTZ_ZxshModel model) throws ServiceException;

	public String GJ_JCBLTZYYBL(JCBLTZ_YyblModel model) throws ServiceException;
	
	public Map<String, Object> GJ_JCBLTZGETBYID(JCBLTZ_GetbyidModel model) throws ServiceException;

	public String GJ_JCBLTZACEEPT(JCBLTZ_AceeptModel model) throws ServiceException;

	

}
