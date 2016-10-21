package com.sundsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = IDASExchangeServices.NAME_SPACE)
public interface IDASExchangeServices {

	public static final String NAME_SPACE = "http://www.sundsoft.com";

	/**
	 * 
	* @author liujn
	* @Title: CreateDaPackage
	* @Description: 根据档案袋keycode生成档案袋并返回档案元素
	* @param @param areaId
	* @param @param pkgKeyCode
	* @param @param owner
	* @param @param keyword
	* @param @param creater
	* @param @param title
	* @param @param script
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "CreateDaPackage")
	public String CreateDaPackage(@WebParam(name = "areaId", targetNamespace = NAME_SPACE) int areaId,
			@WebParam(name = "pkgKeyCode", targetNamespace = NAME_SPACE) String pkgKeyCode,
			@WebParam(name = "owner", targetNamespace = NAME_SPACE) String owner,
			@WebParam(name = "keyword", targetNamespace = NAME_SPACE) String keyword,
			@WebParam(name = "creater", targetNamespace = NAME_SPACE) String creater,
			@WebParam(name = "title", targetNamespace = NAME_SPACE) String title,
			@WebParam(name = "script", targetNamespace = NAME_SPACE) String script);

	/**
	 * 
	* @author liujn
	* @Title: SaveFile
	* @Description: 保存文件
	* @param @param arcCode
	* @param @param eleId
	* @param @param fileData
	* @param @param creater
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SaveFile")
	public String SaveFile(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "eleId", targetNamespace = NAME_SPACE) int eleId,
			@WebParam(name = "fileData", targetNamespace = NAME_SPACE) byte[] fileData,
			@WebParam(name = "creater", targetNamespace = NAME_SPACE) String creater);

	/**
	 * 
	* @author liujn
	* @Title: GetPkgElements
	* @Description: 获取档案袋元素
	* @param @param arcCode
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "GetPkgElements")
	public String GetPkgElements(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode);

	/**
	 * 
	* @author liujn
	* @Title: GetPkgElmentsToJson
	* @Description: 根据档案袋主表编码获取档案袋元素
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "GetPkgElmentsToJson")
	public String GetPkgElmentsToJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: GetPicByPkgCodeEleId
	* @Description: 获取档案袋具体档案元素下的图片信息
	* @param @param arcCode
	* @param @param eleId 
	* @param @return
	* @return String
	* @throws
	 */
	public String GetPicByPkgCodeEleId(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "eleId", targetNamespace = NAME_SPACE) int eleId);

	/**
	 * 
	* @author liujn
	* @Title: GetPicByPkgCodeEleIdToJson
	* @Description: 
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String GetPicByPkgCodeEleIdToJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: GetPicByPathToJson
	* @Description: 根据图片路径获取图片
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String GetPicByPathToJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: DelContent
	* @Description: 删除图片
	* @param @param arcCode
	* @param @param eleId
	* @param @param fileName
	* @param @return
	* @return String
	* @throws
	 */
	public String DelContent(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "eleId", targetNamespace = NAME_SPACE) int eleId,
			@WebParam(name = "fileName", targetNamespace = NAME_SPACE) String fileName);

	/**
	 * 
	* @author liujn
	* @Title: DelContentJson
	* @Description: 删除图片，使用js调用
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String DelContentJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: ChangeFileIndex
	* @Description: 修改图片顺序
	* @param @param arcCode
	* @param @param eleId
	* @param @param preIndex
	* @param @param curIndex
	* @param @param fileName
	* @param @return
	* @return String
	* @throws
	 */
	public String ChangeFileIndex(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "eleId", targetNamespace = NAME_SPACE) int eleId,
			@WebParam(name = "preIndex", targetNamespace = NAME_SPACE) int preIndex,
			@WebParam(name = "curIndex", targetNamespace = NAME_SPACE) int curIndex,
			@WebParam(name = "fileName", targetNamespace = NAME_SPACE) String fileName);

	/**
	 * 
	* @author liujn
	* @Title: ChangeFileIndexJson
	* @Description: 修改元素顺序
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String ChangeFileIndexJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: UpdateFileInfo
	* @Description: 修改文件信息
	* @param @param arcCode
	* @param @param eleId
	* @param @param fileName
	* @param @param descript
	* @param @param keyWord
	* @param @return
	* @return String
	* @throws
	 */
	public String UpdateFileInfo(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "eleId", targetNamespace = NAME_SPACE) int eleId,
			@WebParam(name = "fileName", targetNamespace = NAME_SPACE) String fileName,
			@WebParam(name = "descript", targetNamespace = NAME_SPACE) String descript,
			@WebParam(name = "keyWord", targetNamespace = NAME_SPACE) String keyWord);

	/**
	 * 
	* @author liujn
	* @Title: UpdateFileInfoJson
	* @Description: 修改图片信息
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String UpdateFileInfoJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);

	/**
	 * 
	* @author liujn
	* @Title: UpdateArchiveInfo
	* @Description: 修改档案主表信息
	* @param @param arcCode
	* @param @param owner
	* @param @param keyWord
	* @param @param title
	* @param @param descript
	* @param @return
	* @return String
	* @throws
	 */
	public String UpdateArchiveInfo(@WebParam(name = "arcCode", targetNamespace = NAME_SPACE) String arcCode,
			@WebParam(name = "owner", targetNamespace = NAME_SPACE) String owner,
			@WebParam(name = "keyWord", targetNamespace = NAME_SPACE) String keyWord,
			@WebParam(name = "title", targetNamespace = NAME_SPACE) String title,
			@WebParam(name = "descript", targetNamespace = NAME_SPACE) String descript);
	
	/**
	 * 
	* @author liujn
	* @Title: UpdateArchiveInfoJson
	* @Description: 修改档案主表信息
	* @param @param json
	* @param @return
	* @return String
	* @throws
	 */
	public String UpdateArchiveInfoJson(@WebParam(name = "json", targetNamespace = NAME_SPACE) String json);
	
	
}
