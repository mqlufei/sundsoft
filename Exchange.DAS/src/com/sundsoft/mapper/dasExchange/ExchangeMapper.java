package com.sundsoft.mapper.dasExchange;

import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ExchangeMapper {

	public Map<String, Object> CreateDaPackage(Map<String, Object> params) throws Exception;

	public Map<String, Object> GetFileDicInfo(Map<String, Object> params) throws Exception;

	public void SaveFileInfo(Map<String, Object> params) throws Exception;

	public Map<String, Object> GetPkgElement(Map<String, Object> params) throws Exception;

	public Map<String, Object> GetPicByPkgCodeEleId(Map<String, Object> params) throws Exception;

	public void DelContent(Map<String, Object> params) throws Exception;

	public void ChangeFileIndex(Map<String, Object> params) throws Exception;

	public void UpdateFileInfo(Map<String, Object> params) throws Exception;

	public void UpdateArchiveInfo(Map<String, Object> params) throws Exception;

}
