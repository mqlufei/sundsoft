package com.sundsoft.service.gjExchange.impl;

import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.gjExchange.DocMapper;
import com.sundsoft.model.in.gj.docgetdocbyid.GetDocByID_AceeptModel;
import com.sundsoft.service.gjExchange.IGj_DocService;
import com.sundsoft.utils.BeanToMapUtil;
@Service
public class Gj_DocServiceImpl implements IGj_DocService {

	@Autowired
	private DocMapper docMapper;
	private static final Logger log = LogManager.getLogger(Gj_DocServiceImpl.class);

	@Override
	public Map<String, Object> Doc_GetDocByID(GetDocByID_AceeptModel model) throws ServiceException {
		try {
			Map<String, Object> params = BeanToMapUtil.convertBean(model);
			params = docMapper.Doc_GetDocByID(params);
			return params;
		}
		catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
}
