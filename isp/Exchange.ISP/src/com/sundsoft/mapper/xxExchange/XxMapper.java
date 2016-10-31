package com.sundsoft.mapper.xxExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface XxMapper {
	
	public Map<String, Object> XX_SAVESMS(Map<String, Object> params) throws Exception;

}
