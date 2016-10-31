package com.sundsoft.webservice.xxExchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = IXxExchangeService.NAME_SPACE)
public interface IXxExchangeService {
	
	public static final String NAME_SPACE = "http://www.sundsoft.com/xxExchangeService";
	
	/**
	 * 
	* @author liujn
	* @Title: XX_SAVESMS
	* @Description: 短信发送
	* @param P_GJJZXID
	* @param P_YWJKMC
	* @param P_DHHM
	* @param P_DXNR
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "XX_SAVESMS")
	public String XX_SAVESMS(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) int P_GJJZXID,
			@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String P_YWJKMC,
			@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String P_DHHM,
			@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String P_DXNR);
}
