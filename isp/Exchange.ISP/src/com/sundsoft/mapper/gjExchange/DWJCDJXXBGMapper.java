package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DWJCDJXXBGMapper {

	public Map<String, Object> GJ_DWJCDJXXBGGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJXXBGZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJXXBGYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJXXBGGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> GJ_DWJCDJXXBGAceept(Map<String, Object> params) throws Exception;
}
