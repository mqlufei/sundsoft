package com.sundsoft.mapper.crmExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface DwqudjMapper {

	public Map<String, Object> CRM_QY_DWQYLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_QY_DWQY(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_SAVEDWZL(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_GETDWZL(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_DELDWZL(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_DWZLNEWPWD(Map<String, Object> params) throws Exception;

	public Map<String, Object> CRM_DWZLXGJBRZL(Map<String, Object> params) throws Exception;
}
