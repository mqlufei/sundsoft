package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_AceeptModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetbydwzhModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_YyblModel;
import com.sundsoft.model.in.gj.slgjzgxxbg.ZGXXBG_ZxshModel;

public interface IGj_ZGXXBGService {

	public Map<String, Object> GJ_ZGXXBGGETLIST(ZGXXBG_GetlistModel model) throws ServiceException;

	public String GJ_ZGXXBGZXSH(ZGXXBG_ZxshModel model) throws ServiceException;

	public String GJ_ZGXXBGYYBL(ZGXXBG_YyblModel model) throws ServiceException;

	public Map<String, Object> GJ_ZGXXBGGETMXLIST(ZGXXBG_GetmxlistModel model) throws ServiceException;

	public Map<String, Object> GJ_ZGXXBGGETBYDWZH(ZGXXBG_GetbydwzhModel model) throws ServiceException;

	public String GJ_ZGXXBGACEEPT(ZGXXBG_AceeptModel model) throws ServiceException;

}
