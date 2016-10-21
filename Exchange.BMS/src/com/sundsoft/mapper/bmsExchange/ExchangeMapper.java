package com.sundsoft.mapper.bmsExchange;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;

@Repository
@Transactional
public interface ExchangeMapper {
	
	public String CallbackLoandeductSinglePayment(Map<String,Object> params) throws Exception;

	public String CallBackBatchPay(Map<String,Object> params) throws Exception;

	public String CallbackPrePay(Map<String,Object> params) throws Exception;

	public String CallBackGaBatchPay(Map<String,Object> params) throws Exception;

	public String CallbackGaSinglePay(Map<String,Object> params) throws Exception;

	public String CallbackTranMoney(Map<String,Object> params) throws Exception;

	public String CallbackQueBalance(Map<String,Object> params) throws Exception;

	public boolean SaveDetailResultToTemp(List<UtbBankTmpAccDetailVO> dt) throws Exception;

	public String CallbackQueDetail(Map<String,Object> params) throws Exception;

	public boolean SaveNoticeToTemp( List<UtbTmpCnYhjslsxxVO> dt) throws Exception;

	public String AddNotice(Map<String,Object> params) throws Exception;
	
}
