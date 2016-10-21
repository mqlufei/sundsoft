package com.sundsoft.webservice.gjExchange;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = IGjExchangeService.NAME_SPACE)
public interface IGjExchangeService {

	public static final String NAME_SPACE = "http://www.sundsoft.com/gjExchangeService";

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_HJ
	* @Description: 归集汇缴业务受理
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_HJ")
	public String SL_GJ_HJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_BJ
	* @Description: 归集补缴业务受理
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_BJ")
	public String SL_GJ_BJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_DWJCDJXXBG
	* @Description: 单位缴存登记信息变更受理
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_DWJCDJXXBG")
	public String SL_GJ_DWJCDJXXBG(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_DWJCDJZX
	* @Description: 单位缴存登记注销受理
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_DWJCDJZX")
	public String SL_GJ_DWJCDJZX(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_ZGXXBG
	* @Description: 职工信息变更
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_ZGXXBG")
	public String SL_GJ_ZGXXBG(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_GRZHTCZY
	* @Description: 个人账户同城转移更
	* @param @param p_Data
	* @param @return
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_GRZHTCZY")
	public String SL_GJ_GRZHTCZY(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_GJJYDZY
	* @Description: 公积金异地转移
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_GJJYDZY")
	public String SL_GJ_GJJYDZY(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_TG
	* @Description: 托管
	* @param  p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_TG")
	public String SL_GJ_TG(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_JCHJ
	* @Description: 缓缴变更受理
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_JCHJ")
	public String SL_GJ_JCHJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_LHJYRYJC
	* @Description: 灵活就业人员缴存
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_LHJYRYJC")
	public String SL_GJ_LHJYRYJC(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_YWSL
	* @Description: 在线办理，在线预约
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_YWSL")
	public String SL_GJ_YWSL(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_DWJCDJ
	* @Description: 单位缴存登记信息变更受理
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_DWJCDJ")
	public String SL_GJ_DWJCDJ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: Doc_GetDocByID
	* @Description: 查看图片
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "Doc_GetDocByID")
	public String Doc_GetDocByID(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

	/**
	 * 
	* @author liujn
	* @Title: SL_GJ_JCBLTZ
	* @Description: 缴存比例
	* @param p_Data
	* @return String
	* @throws
	 */
	@WebMethod(operationName = "SL_GJ_JCBLTZ")
	public String SL_GJ_JCBLTZ(@WebParam(name = "p_Data", targetNamespace = NAME_SPACE) String p_Data);

}
