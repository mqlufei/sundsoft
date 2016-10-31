package com.sundsoft.service.crmExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_GetlistModel;
import com.sundsoft.model.in.crm.slcrmgrqudj.GRQUDJ_SaveModel;

public interface ICrm_GrqudjService {

	public Map<String, Object> CRM_QY_GETGRZLLIST(GRQUDJ_GetlistModel model) throws ServiceException;

	public String CRM_QY_GRZL(GRQUDJ_AceeptModel model) throws ServiceException;

	public String CRM_SAVEGRZL(GRQUDJ_SaveModel model) throws ServiceException;

}
