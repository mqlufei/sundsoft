package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface LHJYRYJCMapper {

	public Map<String, Object> GJ_LHJYRYJCGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_LHJYRYJCZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_LHJYRYJCYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_LHJYRYJCGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_LHJYRYJCACEEPT(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_LHJYRYJCGETBYID(Map<String, Object> params) throws Exception;
}
