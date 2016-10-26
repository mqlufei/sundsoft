package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface JCBLTZMapper {

	public Map<String, Object> GJ_JCBLTZGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCBLTZZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCBLTZYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCBLTZGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCBLTZACEEPT(Map<String, Object> params) throws Exception;
}
