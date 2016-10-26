package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_AceeptModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_GetzxbyidModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_YyblModel;
import com.sundsoft.model.in.gj.slgjywsl.YWSL_ZxshModel;

public interface IGj_YWSLService {

	public Map<String, Object> GJ_YWSLGETLIST(YWSL_GetlistModel model) throws ServiceException;

	public String GJ_YWSLZXSH(YWSL_ZxshModel model) throws ServiceException;

	public String GJ_YWSLYYBL(YWSL_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_YWSLGETMXLIST(YWSL_GetmxlistModel model) throws ServiceException;

	public Map<String, Object> GJ_YWSLGETBYDWZH(YWSL_GetbydwzhModel model) throws ServiceException;

	public String GJ_YWSLACEEPT(YWSL_AceeptModel model) throws ServiceException;

	public Map<String, Object> GJ_YWSLGETZXBYID(YWSL_GetzxbyidModel model) throws ServiceException;

}
