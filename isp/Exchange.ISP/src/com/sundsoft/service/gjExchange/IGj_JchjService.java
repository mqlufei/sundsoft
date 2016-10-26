package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_AceeptModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetbyidModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_YyblModel;
import com.sundsoft.model.in.gj.slgjjchj.JCHJ_ZxshModel;

public interface IGj_JchjService {

	public Map<String, Object> GJ_JCHJGETLIST(JCHJ_GetlistModel model) throws ServiceException;

	public String GJ_JCHJZXSH(JCHJ_ZxshModel model) throws ServiceException;

	public String GJ_JCHJYYBL(JCHJ_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_JCHJGETBYID(JCHJ_GetbyidModel model) throws ServiceException;

	public String GJ_JCHJACEEPT(JCHJ_AceeptModel model) throws ServiceException;

}
