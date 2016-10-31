package com.sundsoft.mapper.dkExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DkMapper {

	public Map<String, Object> DK_V5DKSLGETLIST(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLZXSH(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLYYBL(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLGETBYID(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLAceept(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLGetDocsViewList(Map<String, Object> params) throws Exception;

	public Map<String, Object> DK_V5DKSLGetDocsByID(Map<String, Object> params) throws Exception;
}
