package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GJJYDZYMapper {

	public Map<String, Object> GJ_GJJYDZYGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GJJYDZYZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GJJYDZYYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GJJYDZYGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GJJYDZYGETBYDWZH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_GJJYDZYACEEPT(Map<String, Object> params) throws Exception;
}
