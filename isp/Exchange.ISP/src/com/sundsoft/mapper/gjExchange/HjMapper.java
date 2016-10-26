package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface HjMapper {

	public Map<String, Object> GJ_HJGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETHJMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETGRZHSLLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETJCJSTZLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETFCQFLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETAYMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETHJZLBYYWID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJSaveErrorToGRZHSL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJSaveErrorToJCJSTZ(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJSaveErrorToFCQF(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJAceeptZL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_HJGETHJZJBYID(Map<String, Object> params) throws Exception;
}
