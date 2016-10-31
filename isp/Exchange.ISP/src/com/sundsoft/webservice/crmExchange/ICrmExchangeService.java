package com.sundsoft.webservice.crmExchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = ICrmExchangeService.NAME_SPACE)
public interface ICrmExchangeService {

	public static final String NAME_SPACE = "http://www.sundsoft.com/crmExchangeService";

	/**
	 * 
	* @author liujn
	* @Title: SL_CRM_GRQUDJ
	* @Description: CRM个人签约登记
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_CRM_GRQUDJ")
	public String SL_CRM_GRQUDJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_CRM_DWQUDJ
	* @Description: CRM单位签约登记
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_CRM_DWQUDJ")
	public String SL_CRM_DWQUDJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);
	/**
	 * 
	* @author liujn
	* @Title: SL_CRM_DWRZ
	* @Description: 单位认证
	* @param crmNum
	* @param rzfs
	* @param rzyx
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_CRM_DWRZ")
	public String SL_CRM_DWRZ(@WebParam(name = "crmNum", targetNamespace = NAME_SPACE) String crmNum,
			@WebParam(name = "rzfs", targetNamespace = NAME_SPACE) String rzfs,
			@WebParam(name = "rzyx", targetNamespace = NAME_SPACE) byte[] rzyx);
	/**
	 * 
	* @author liujn
	* @Title: SL_CRM_DWRZYX
	* @Description: 单位查看认证影像
	* @param crmNum
	* @return byte[]
	* @throws
	 */
	@WebMethod(operationName = "SL_CRM_DWRZYX")
	public byte[] SL_CRM_DWRZYX(@WebParam(name = "crmNum", targetNamespace = NAME_SPACE) String crmNum);

}
