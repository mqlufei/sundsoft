package com.sundsoft.service.bmsExchange;

import java.util.List;
import java.util.Map;

import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;

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

}
