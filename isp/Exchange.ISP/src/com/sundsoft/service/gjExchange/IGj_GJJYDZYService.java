package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_AceeptModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_YyblModel;
import com.sundsoft.model.in.gj.slgjgjjydzy.GJJYDZY_ZxshModel;

public interface IGj_GJJYDZYService {

	public Map<String, Object> GJ_GJJYDZYGETLIST(GJJYDZY_GetlistModel model) throws ServiceException;

	public String GJ_GJJYDZYZXSH(GJJYDZY_ZxshModel model) throws ServiceException;

	public String GJ_GJJYDZYYYBL(GJJYDZY_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_GJJYDZYGETMXLIST(GJJYDZY_GetmxlistModel model) throws ServiceException;

	public Map<String, Object> GJ_GJJYDZYGETBYDWZH(GJJYDZY_GetbydwzhModel model) throws ServiceException;

	public String GJ_GJJYDZYACEEPT(GJJYDZY_AceeptModel model) throws ServiceException;

}
