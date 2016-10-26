package com.sundsoft.mapper.gjExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface DocMapper {

	public Map<String, Object> Doc_GetDocByID(Map<String, Object> params) throws Exception;
}
