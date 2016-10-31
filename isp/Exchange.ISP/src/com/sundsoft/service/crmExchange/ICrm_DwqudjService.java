package com.sundsoft.service.crmExchange;

import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_AceeptModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_DelModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetbyidModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GetlistdwModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_GxjbrxxModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_NewpwdModel;
import com.sundsoft.model.in.crm.slcrmdwqudj.DWQUDJ_SaveModel;

public interface ICrm_DwqudjService {

	public Map<String, Object> CRM_QY_DWQYLIST(DWQUDJ_GetlistdwModel model) throws ServiceException;

	public String CRM_QY_DWQY(DWQUDJ_AceeptModel model) throws ServiceException;

	public String CRM_SAVEDWZL(DWQUDJ_SaveModel model) throws ServiceException;

	public Map<String, Object> CRM_GETDWZL(DWQUDJ_GetbyidModel model) throws ServiceException;

	public String CRM_DELDWZL(DWQUDJ_DelModel model) throws ServiceException;

	public String CRM_DWZLNEWPWD(DWQUDJ_NewpwdModel model) throws ServiceException;

	public String CRM_DWZLXGJBRZL(DWQUDJ_GxjbrxxModel model) throws ServiceException;

}
