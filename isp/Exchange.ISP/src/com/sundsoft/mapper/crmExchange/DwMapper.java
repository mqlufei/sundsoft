package com.sundsoft.mapper.crmExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface DwMapper {

	public Map<String, Object> ZXWDDT(Map<String, Object> params) throws Exception;
	
	public Map<String, Object> CRM_GETDWZL(Map<String, Object> params) throws Exception;
}
