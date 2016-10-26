package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjtg.TG_AceeptModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetlistModel;
import com.sundsoft.model.in.gj.slgjtg.TG_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjtg.TG_YyblModel;
import com.sundsoft.model.in.gj.slgjtg.TG_ZxshModel;

public interface IGj_TgService {

	public Map<String, Object> GJ_TGGETLIST(TG_GetlistModel model) throws ServiceException;

	public String GJ_TGZXSH(TG_ZxshModel model) throws ServiceException;

	public String GJ_TGYYBL(TG_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_TGGETMXLIST(TG_GetmxlistModel model) throws ServiceException;

	public Map<String, Object> GJ_TGGETBYDWZH(TG_GetbydwzhModel model) throws ServiceException;

	public String GJ_TGACEEPT(TG_AceeptModel model) throws ServiceException;

}
