package com.sundsoft.mapper.crmExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface GrqudjMapper {

	public Map<String, Object> CRM_QY_GETGRZLLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_QY_GRZL(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_SAVEGRZL(Map<String, Object> params) throws Exception;
}
