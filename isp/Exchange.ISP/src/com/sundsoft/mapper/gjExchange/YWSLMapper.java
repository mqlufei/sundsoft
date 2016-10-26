package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface YWSLMapper {

	public Map<String, Object> GJ_YWSLGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLGETBYDWZH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLACEEPT(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_YWSLGETZXBYID(Map<String, Object> params) throws Exception;
}
