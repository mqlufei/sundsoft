package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DWJCDJZXMapper {

	public Map<String, Object> GJ_DWJCDJZXGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJZXZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJZXYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJZXGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJZXAceept(Map<String, Object> params) throws Exception;
}
