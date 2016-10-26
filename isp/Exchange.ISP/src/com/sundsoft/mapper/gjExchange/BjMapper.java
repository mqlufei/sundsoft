package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BjMapper {

	public Map<String, Object> GJ_BJGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_BJZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_BJYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_BJGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_BJAceept(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_BJGETBYID(Map<String, Object> params) throws Exception;
}
