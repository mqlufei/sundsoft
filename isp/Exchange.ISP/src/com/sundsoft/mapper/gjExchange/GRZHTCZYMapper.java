package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GRZHTCZYMapper {

	public Map<String, Object> GJ_GRZHTCZYGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GRZHTCZYZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GRZHTCZYYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GRZHTCZYGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GRZHTCZYGETBYDWZH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GRZHTCZYACEEPT(Map<String, Object> params) throws Exception;
}
