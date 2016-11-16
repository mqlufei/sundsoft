package com.sundsoft.mapper.bmsExchange;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;
import com.sundsoft.model.in.TableParam;

@Repository
@Transactional
public interface ExchangeMapper {

	public String CallbackLoandeductSinglePayment(Map<String, Object> params) throws Exception;

	public String CallBackBatchPay(Map<String, Object> params) throws Exception;

	public String CallbackPrePay(Map<String, Object> params) throws Exception;

	public String CallBackGaBatchPay(Map<String, Object> params) throws Exception;

	public String CallbackGaSinglePay(Map<String, Object> params) throws Exception;

	public String CallbackTranMoney(Map<String, Object> params) throws Exception;

	public String CallbackQueBalance(Map<String, Object> params) throws Exception;

	public boolean SaveDetailResultToTemp(List<UtbBankTmpAccDetailVO> dt) throws Exception;

	public String CallbackQueDetail(Map<String, Object> params) throws Exception;

	public boolean SaveNoticeToTemp(List<UtbTmpCnYhjslsxxVO> dt) throws Exception;

	public String AddNotice(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj101(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj102(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj111(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj112(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj113(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj114(Map<String, Object> params) throws Exception;

	public Map<String, Object> ProcessGjj115(Map<String, Object> params) throws Exception;

}
