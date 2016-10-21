package com.sundsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = IBMSExchangeServices.NAME_SPACE)
public interface IBMSExchangeServices {

	public static final String NAME_SPACE = "http://www.sundsoft.com";

	@WebMethod(operationName = "testservice")
	public String loanApply(
			// 参数列表
			@WebParam(name = "accname", targetNamespace = NAME_SPACE) String accname);

	/// <summary>
	/// 单笔交易结果通知
	@WebMethod(operationName = "SingleCallBack")
	public String SingleCallBack(@WebParam(name = "seqno", targetNamespace = NAME_SPACE) String seqno,
			@WebParam(name = "state", targetNamespace = NAME_SPACE) int state,
			@WebParam(name = "info", targetNamespace = NAME_SPACE) String info,
			@WebParam(name = "hostseqno", targetNamespace = NAME_SPACE) String hostseqno);

	/// <summary>
	/// 批量交易结果通知
	/// </summary>
	@WebMethod(operationName = "BatchCallBack")
	public String BatchCallBack(@WebParam(name = "jsonResult", targetNamespace = NAME_SPACE) String jsonResult);

	/// <summary>
	/// 回调通知账户余额
	/// </summary>
	@WebMethod(operationName = "QueryBalanceCallBack")
	public String QueryBalanceCallBack(@WebParam(name = "seqno", targetNamespace = NAME_SPACE) String seqno,
			@WebParam(name = "state", targetNamespace = NAME_SPACE) int state,
			@WebParam(name = "info", targetNamespace = NAME_SPACE) String info,
			@WebParam(name = "acctBal", targetNamespace = NAME_SPACE) String acctBal,
			@WebParam(name = "acctRestBal", targetNamespace = NAME_SPACE) String acctRestBal,
			@WebParam(name = "acctOverBal", targetNamespace = NAME_SPACE) String acctOverBal,
			@WebParam(name = "acctStatus", targetNamespace = NAME_SPACE) String acctStatus);


	@WebMethod(operationName = "QueryAccDetailCallBack")
	public String QueryAccDetailCallBack(@WebParam(name = "jsonResult", targetNamespace = NAME_SPACE) String jsonResult);


	@WebMethod(operationName = "NoticeAccCallBack")
	public String NoticeAccCallBack(@WebParam(name = "jsonResult", targetNamespace = NAME_SPACE) String jsonResult);
	
	
	@WebMethod(operationName = "CallBackSingleCollection")
	public int CallBackSingleCollection();

}
