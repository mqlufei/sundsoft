package com.sundsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = IDocTransServices.NAME_SPACE)
public interface IDocTransServices {

	public static final String NAME_SPACE = "http://www.sundsoft.com";


	/**
	 * 
	* @author liujn
	* @Title: WriteFile
	* @Description: 保存文件
	* @param @param sPath
	* @param @param sFileName
	* @param @param imgFile
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "WriteFile")
	public boolean WriteFile(String sPath, String sFileName, byte[] imgFile) throws Exception;

	/**
	 * 
	* @author liujn
	* @Title: ReadFile
	* @Description: 读取文件
	* @param @param path
	* @param @return
	* @return byte[]
	* @throws
	 */
	@WebMethod(operationName = "ReadFile")
	public byte[] ReadFile(String path) throws Exception;



}
