package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjbj.BJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_YyblModel;
import com.sundsoft.model.in.gj.slgjbj.BJ_ZxshModel;

public interface IGj_BjService {

	public Map<String, Object> GJ_BJGETLIST(BJ_GetlistModel model) throws ServiceException;

	public String GJ_BJZXSH(BJ_ZxshModel model) throws ServiceException;

	public String GJ_BJYYBL(BJ_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_BJGETMXLIST(BJ_GetmxlistModel model) throws ServiceException;

	public String GJ_BJAceept(BJ_AceeptModel model) throws ServiceException;

	public Map<String, Object> GJ_BJGETBYID(BJ_GetbyidModel model) throws ServiceException;
	
	

}
