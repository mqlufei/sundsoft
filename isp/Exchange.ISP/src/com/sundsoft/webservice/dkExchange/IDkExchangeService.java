package com.sundsoft.webservice.dkExchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = IDkExchangeService.NAME_SPACE)
public interface IDkExchangeService {
	
	public static final String NAME_SPACE = "http://www.sundsoft.com/dkExchangeService";

	/**
	 * 
	* @author liujn
	* @Title: SL_DK_DKSL_V5
	* @Description: V5贷款受理
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_DK_DKSL_V5")
	public String SL_DK_DKSL_V5(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);
	
	/**
	 * 
	* @author liujn
	* @Title: Isp_GetDocFile
	* @Description: 返回图片二进制流
	* @param p_PathFile
	* @return byte[]
	* @throws
	 */
	@WebMethod(operationName = "Isp_GetDocFile")
	public byte[] Isp_GetDocFile(@WebParam(name = "p_PathFile", targetNamespace = NAME_SPACE) String p_PathFile);
}
