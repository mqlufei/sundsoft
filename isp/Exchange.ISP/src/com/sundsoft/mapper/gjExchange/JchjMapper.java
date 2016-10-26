package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface JchjMapper {

	public Map<String, Object> GJ_JCHJGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCHJZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCHJYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCHJGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_JCHJACEEPT(Map<String, Object> params) throws Exception;
}
