package com.sundsoft.service.bmsExchange;

import java.util.List;
import java.util.Map;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;
import com.sundsoft.model.in.TableParam;

public interface IExchangeService {

	public String getErrorMsg();

	public Map<String,String> CallbackLoandeductSinglePayment(String seqno, int state, String info, String hostseqno) ;

	public Map<String,String> CallBackBatchPay(String refseqno, String bankXml) ;

	public Map<String,String> CallbackPrePay(String seqno, int state, String info, String hostseqno) ;

	public Map<String,String> CallBackGaBatchPay(String refseqno, String bankXml) ;

	public Map<String,String> CallbackGaSinglePay(String seqno, int state, String info, String hostseqno) ;

	public Map<String,String> CallbackTranMoney(String seqno, int state, String info, String hostseqno) ;

	public Map<String,String> CallbackQueBalance(String seqno, int state, String info, Double acctBal, Double acctRestBal, Double acctOverBal,
			String acctStatus) ;

	public boolean SaveDetailResultToTemp(List<UtbBankTmpAccDetailVO> dt) throws Exception;

	public Map<String,String> CallbackQueDetail(String seqno, int state, String info) ;

	public boolean SaveNoticeToTemp( List<UtbTmpCnYhjslsxxVO> dt) throws Exception;

	public Map<String,String> AddNotice(String sendSeqNo) ;
	
	public Map<String,Object> ProcessGjj101(int p_Func, String p_CardID, String p_OldCardID, String p_Name, String p_IDCard, String p_BankRegCode) throws ServiceException;
	
	public Map<String,Object> ProcessGjj102(TableParam p_SignInfo, String p_AprvCode, String p_BankRegCode) throws ServiceException;
	
	public Map<String,Object> ProcessGjj111(String p_CardID, String p_BankRegCode) throws ServiceException;
	
	public Map<String,Object> ProcessGjj112(String p_CardID, String p_StartDate, String p_EndDate) throws ServiceException;
	
	public Map<String,Object> ProcessGjj113(String p_CardID, String p_IDCard, String p_BankRegCode) throws ServiceException;
	
	public Map<String,Object> ProcessGjj114(String p_CardID, String p_IDCard, String p_StartDate, String p_EndDate) throws ServiceException;
	
	public Map<String,Object> ProcessGjj115(String p_IDCard, String p_Name) throws ServiceException;

}
