package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgrzhtczy.GRZHTCZY_ZxshModel;

public interface IGj_GRZHTCZYService {

	public Map<String, Object> GJ_GRZHTCZYGETLIST(GRZHTCZY_GetlistModel model) throws ServiceException;

	public String GJ_GRZHTCZYZXSH(GRZHTCZY_ZxshModel model) throws ServiceException;

	public String GJ_GRZHTCZYYYBL(GRZHTCZY_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_GRZHTCZYGETMXLIST(GRZHTCZY_GetmxlistModel model) throws ServiceException;

	public String GJ_GRZHTCZYGETBYDWZH(GRZHTCZY_GetbydwzhModel model) throws ServiceException;

	public String GJ_GRZHTCZYACEEPT(GRZHTCZY_AceeptModel model) throws ServiceException;

}
