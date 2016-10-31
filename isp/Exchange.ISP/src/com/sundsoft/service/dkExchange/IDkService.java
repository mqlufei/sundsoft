package com.sundsoft.service.dkExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.dk.V5_AceeptModel;
import com.sundsoft.model.in.dk.V5_DocsviewModel;
import com.sundsoft.model.in.dk.V5_GetbyidModel;
import com.sundsoft.model.in.dk.V5_GetdocsbyidModel;
import com.sundsoft.model.in.dk.V5_GetlistModel;
import com.sundsoft.model.in.dk.V5_YyblModel;
import com.sundsoft.model.in.dk.V5_ZxshModel;

public interface IDkService {

	public Map<String, Object> DK_V5DKSLGETLIST(V5_GetlistModel model) throws ServiceException;

	public String DK_V5DKSLZXSH(V5_ZxshModel model) throws ServiceException;

	public String DK_V5DKSLYYBL(V5_YyblModel model) throws ServiceException;

	public Map<String, Object> DK_V5DKSLGETBYID(V5_GetbyidModel model) throws ServiceException;

	public String DK_V5DKSLAceept(V5_AceeptModel model) throws ServiceException;

	public Map<String, Object> DK_V5DKSLGetDocsViewList(V5_DocsviewModel model) throws ServiceException;

	public Map<String, Object> DK_V5DKSLGetDocsByID(V5_GetdocsbyidModel model) throws ServiceException;
}
