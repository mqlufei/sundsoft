package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TgMapper {

	public Map<String, Object> GJ_TGGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_TGZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_TGYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_TGGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_TGGETBYDWZH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_TGACEEPT(Map<String, Object> params) throws Exception;
}
