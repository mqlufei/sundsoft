package com.sundsoft.service.dasExchange;

import java.util.Map;

public interface IExchangeService {

	public String getErrorMsg();

	public Map<String, Object> CreateDaPackage(String pkgcode, String owner, String keyword, String creater,
			String title, String script, String directory);

	public Map<String, Object> GetFileDicInfo(String arcCode, int eleId);

	public void SaveFileInfo(String arcCode, int eleId, String fileName, String subdir, String creater, int fileSize,
			int fileIndex) throws Exception;

	public Map<String, Object> GetPkgElement(String arcCode);

	public Map<String, Object> GetPicByPkgCodeEleId(String arcCode, int eleId);

	public void DelContent(String arcCode, int eleId, String fileName) throws Exception;

	public void ChangeFileIndex(String arcCode, int eleId, int preIndex, int curIndex, String fileName)
			throws Exception;

	public void UpdateFileInfo(String arcCode, int eleId, String fileName, String descript, String keyWord)
			throws Exception;

	public void UpdateArchiveInfo(String arcCode, String owner, String keyWord, String title, String descript)
			throws Exception;

}
