package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ZGXXBGMapper {

	public Map<String, Object> GJ_ZGXXBGGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_ZGXXBGZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_ZGXXBGYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_ZGXXBGGETMXLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_ZGXXBGGETBYDWZH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_ZGXXBGACEEPT(Map<String, Object> params) throws Exception;
}
