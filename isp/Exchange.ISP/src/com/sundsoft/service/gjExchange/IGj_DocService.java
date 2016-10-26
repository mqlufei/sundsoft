package com.sundsoft.service.gjExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.gj.docgetdocbyid.GetDocByID_AceeptModel;

public interface IGj_DocService {

	public Map<String, Object> Doc_GetDocByID(GetDocByID_AceeptModel model) throws ServiceException;
}
