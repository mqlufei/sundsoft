package com.sundsoft.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.sundsoft.model.in.TableParam;

@WebService(targetNamespace = IBMSExchangeServices.NAME_SPACE)
public interface IBMSExchangeServices {

	public static final String NAME_SPACE = "http://www.sundsoft.com";

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
	public String QueryAccDetailCallBack(
			@WebParam(name = "jsonResult", targetNamespace = NAME_SPACE) String jsonResult);

	@WebMethod(operationName = "NoticeAccCallBack")
	public String NoticeAccCallBack(@WebParam(name = "jsonResult", targetNamespace = NAME_SPACE) String jsonResult);

	@WebMethod(operationName = "CallBackSingleCollection")
	public int CallBackSingleCollection();

	/**
	 * GJJ101 联名卡单笔签约维护
	 * 
	 * @param p_Func
	 * @param p_CardID
	 * @param p_OldCardID
	 * @param p_Name
	 * @param p_IDCard
	 * @param p_BankRegCode
	 * @return
	 */
	@WebMethod(operationName = "GJJ101_SignAndUnSign")
	public String GJJ101_SignAndUnSign(@WebParam(name = "p_Func", targetNamespace = NAME_SPACE) int p_Func,
			@WebParam(name = "p_CardID", targetNamespace = NAME_SPACE) String p_CardID,
			@WebParam(name = "p_OldCardID", targetNamespace = NAME_SPACE) String p_OldCardID,
			@WebParam(name = "p_Name", targetNamespace = NAME_SPACE) String p_Name,
			@WebParam(name = "p_IDCard", targetNamespace = NAME_SPACE) String p_IDCard,
			@WebParam(name = "p_BankRegCode", targetNamespace = NAME_SPACE) String p_BankRegCode);

	/**
	 * GJJ102 联名卡批量签约维护
	 * 
	 * @param p_SignInfo
	 * @param p_AprvCode
	 * @param p_BankRegCode
	 * @return
	 */
	@WebMethod(operationName = "GJJ102_BatchSign")
	public String GJJ102_BatchSign(@WebParam(name = "p_SignInfo", targetNamespace = NAME_SPACE) TableParam p_SignInfo,
			@WebParam(name = "p_AprvCode", targetNamespace = NAME_SPACE) String p_AprvCode,
			@WebParam(name = "p_BankRegCode", targetNamespace = NAME_SPACE) String p_BankRegCode);

	/**
	 * GJJ111 查询公积金归集分户及余额信息
	 * 
	 * @param p_CardID
	 * @param p_BankRegCode
	 * @return
	 */
	@WebMethod(operationName = "GJJ111_GaBalanceQuery")
	public String GJJ111_GaBalanceQuery(@WebParam(name = "p_CardID", targetNamespace = NAME_SPACE) String p_CardID,
			@WebParam(name = "p_BankRegCode", targetNamespace = NAME_SPACE) String p_BankRegCode);

	/**
	 * GJJ112 公积金归集明细查询
	 * 
	 * @param p_CardID
	 * @param p_StartDate
	 * @param p_EndDate
	 * @return
	 */
	@WebMethod(operationName = "GJJ112_GaDetailQuery")
	public String GJJ112_GaDetailQuery(@WebParam(name = "p_CardID", targetNamespace = NAME_SPACE) String p_CardID,
			@WebParam(name = "p_StartDate", targetNamespace = NAME_SPACE) String p_StartDate,
			@WebParam(name = "p_EndDate", targetNamespace = NAME_SPACE) String p_EndDate);

	/**
	 * GJJ113 贷款账户及余额查询
	 * 
	 * @param p_CardID
	 * @param p_IDCard
	 * @param p_BankRegCode
	 * @return
	 */
	@WebMethod(operationName = "GJJ113_LoanBalanceQuery")
	public String GJJ113_LoanBalanceQuery(@WebParam(name = "p_CardID", targetNamespace = NAME_SPACE) String p_CardID,
			@WebParam(name = "p_IDCard", targetNamespace = NAME_SPACE) String p_IDCard,
			@WebParam(name = "p_BankRegCode", targetNamespace = NAME_SPACE) String p_BankRegCode);

	/**
	 * GJJ114 公积金贷款明细查询
	 * 
	 * @param p_CardID
	 * @param p_IDCard
	 * @param p_StartDate
	 * @param p_EndDate
	 * @return
	 */
	@WebMethod(operationName = "GJJ114_LoanDetailQuery")
	public String GJJ114_LoanDetailQuery(@WebParam(name = "p_CardID", targetNamespace = NAME_SPACE) String p_CardID,
			@WebParam(name = "p_IDCard", targetNamespace = NAME_SPACE) String p_IDCard,
			@WebParam(name = "p_StartDate", targetNamespace = NAME_SPACE) String p_StartDate,
			@WebParam(name = "p_EndDate", targetNamespace = NAME_SPACE) String p_EndDate);

	/**
	 * GJJ115 职工基础信息查询
	 * 
	 * @param p_IDCard
	 * @param p_Name
	 * @return
	 */
	@WebMethod(operationName = "GJJ115_IndvInfoQuery")
	public String GJJ115_IndvInfoQuery(@WebParam(name = "p_IDCard", targetNamespace = NAME_SPACE) String p_IDCard,
			@WebParam(name = "p_Name", targetNamespace = NAME_SPACE) String p_Name);

}
