package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_AceeptModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetbyidModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_YyblModel;
import com.sundsoft.model.in.gj.slgjlhjyryjc.LHJYRYJC_ZxshModel;

public interface IGj_LHJYRYJCService {

	public Map<String, Object> GJ_LHJYRYJCGETLIST(LHJYRYJC_GetlistModel model) throws ServiceException;

	public String GJ_LHJYRYJCZXSH(LHJYRYJC_ZxshModel model) throws ServiceException;

	public String GJ_LHJYRYJCYYBL(LHJYRYJC_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_LHJYRYJCGETMXLIST(LHJYRYJC_GetmxlistModel model) throws ServiceException;

	public String GJ_LHJYRYJCACEEPT(LHJYRYJC_AceeptModel model) throws ServiceException;

	public Map<String, Object> GJ_LHJYRYJCGETBYID(LHJYRYJC_GetbyidModel model) throws ServiceException;

}
