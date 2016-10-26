package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetfcqflistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetgrzhsllistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjaymxModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzjbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GethjzlbyidModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetjcjstzlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_GetmxlistModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_HjaceeptzlModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortofcqfModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortogrzhslModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_SaveerrortojcjstzModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_YyblModel;
import com.sundsoft.model.in.gj.slgjhj.HJ_ZxshModel;

public interface IGj_HjService {

	public Map<String, Object> GJ_HJGETLIST(HJ_GetlistModel model) throws ServiceException;

	public String GJ_HJZXSH(HJ_ZxshModel model) throws ServiceException;

	public String GJ_HJYYBL(HJ_YyblModel yyblModel) throws ServiceException;

	public Map<String, Object> GJ_HJGETHJMXLIST(HJ_GetmxlistModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETGRZHSLLIST(HJ_GetgrzhsllistModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETJCJSTZLIST(HJ_GetjcjstzlistModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETFCQFLIST(HJ_GetfcqflistModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETAYMXLIST(HJ_GethjaymxModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETHJZLBYYWID(HJ_GethjzlbyidModel model) throws ServiceException;

	public String GJ_HJSaveErrorToGRZHSL(HJ_SaveerrortogrzhslModel model) throws ServiceException;

	public String GJ_HJSaveErrorToJCJSTZ(HJ_SaveerrortojcjstzModel model) throws ServiceException;

	public String GJ_HJSaveErrorToFCQF(HJ_SaveerrortofcqfModel model) throws ServiceException;

	public String GJ_HJAceeptZL(HJ_HjaceeptzlModel model) throws ServiceException;

	public Map<String, Object> GJ_HJGETHJZJBYID(HJ_GethjzjbyidModel model) throws ServiceException;

}
