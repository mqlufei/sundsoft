package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DWJCDJMapper {

	public Map<String, Object> GJ_DWJCDJGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJACEEPT(Map<String, Object> params) throws Exception;
}
