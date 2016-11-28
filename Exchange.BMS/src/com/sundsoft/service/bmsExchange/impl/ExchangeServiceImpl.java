package com.sundsoft.service.bmsExchange.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sundsoft.exception.ServiceErrorCode;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.mapper.bmsExchange.ExchangeMapper;
import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;
import com.sundsoft.model.in.TableParam;
import com.sundsoft.service.bmsExchange.IExchangeService;

@Service
public class ExchangeServiceImpl implements IExchangeService {

	private static final Logger log = LogManager.getLogger(ExchangeServiceImpl.class);

	@Autowired
	private ExchangeMapper exchangeMapper;

	private String m_Errmsg = ""; // 记录错误信息
	private int m_iRet = 0; // 查询影响行数
	public String ErrorMsg;

	private Map<String, Object> params = null;

	private Map<String, String> resMap = null;

	private static final String SUCC_CODE = "00000";

	private static final String ERR_CODE = "-1";

	@Override
	public String getErrorMsg() {
		String m_STemp = m_Errmsg;
		m_STemp = m_STemp.replace("\r", "");
		m_STemp = m_STemp.replace("\n", "");
		m_STemp = m_STemp.replace("'", "");
		m_STemp = m_STemp.replace("\"", "");
		return m_STemp;
	}

	@Override
	public Map<String, String> CallbackLoandeductSinglePayment(String seqno, int state, String info, String hostseqno) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		params.put("hostseqno", hostseqno);
		try {
			exchangeMapper.CallbackLoandeductSinglePayment(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}
		return resMap;
	}

	@Override
	public Map<String, String> CallBackBatchPay(String refseqno, String bankXml) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("refseqno", refseqno);
		params.put("bankXml", bankXml);
		try {
			exchangeMapper.CallBackBatchPay(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public Map<String, String> CallbackPrePay(String seqno, int state, String info, String hostseqno) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		params.put("hostseqno", hostseqno);
		try {
			exchangeMapper.CallbackPrePay(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public Map<String, String> CallBackGaBatchPay(String refseqno, String bankXml) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("refseqno", refseqno);
		params.put("bankXml", bankXml);
		try {
			exchangeMapper.CallBackGaBatchPay(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public Map<String, String> CallbackGaSinglePay(String seqno, int state, String info, String hostseqno) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		params.put("hostseqno", hostseqno);
		try {
			exchangeMapper.CallbackGaSinglePay(params);
			if(params.get("OUT_MESSAGE")!=null&&StringUtils.isNotBlank(params.get("OUT_MESSAGE").toString())){
				resMap.put("RtnCode", ERR_CODE);
				resMap.put("RtnMsg", params.get("OUT_MESSAGE").toString());
				return resMap;
			}
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public Map<String, String> CallbackTranMoney(String seqno, int state, String info, String hostseqno) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		params.put("hostseqno", hostseqno);
		try {
			exchangeMapper.CallbackTranMoney(params);
			if(params.get("OUT_MESSAGE")!=null&&StringUtils.isNotBlank(params.get("OUT_MESSAGE").toString())){
				resMap.put("RtnCode", ERR_CODE);
				resMap.put("RtnMsg", params.get("OUT_MESSAGE").toString());
				return resMap;
			}
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public Map<String, String> CallbackQueBalance(String seqno, int state, String info, Double acctBal,
			Double acctRestBal, Double acctOverBal, String acctStatus) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		params.put("acctBal", acctBal);
		params.put("acctRestBal", acctRestBal);
		params.put("acctOverBal", acctOverBal);
		params.put("acctStatus", acctStatus);
		try {
			exchangeMapper.CallbackQueBalance(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public boolean SaveDetailResultToTemp(List<UtbBankTmpAccDetailVO> dt) throws Exception {
		return exchangeMapper.SaveDetailResultToTemp(dt);
	}

	@Override
	public Map<String, String> CallbackQueDetail(String seqno, int state, String info) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("seqno", seqno);
		params.put("state", state);
		params.put("info", info);
		try {
			exchangeMapper.CallbackQueDetail(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}

		return resMap;
	}

	@Override
	public boolean SaveNoticeToTemp(List<UtbTmpCnYhjslsxxVO> dt) throws Exception {
		return exchangeMapper.SaveNoticeToTemp(dt);
	}

	@Override
	public Map<String, String> AddNotice(String sendSeqNo) {
		params = new HashMap<String, Object>();
		resMap = new HashMap<String, String>();
		params.put("sendSeqNo", sendSeqNo);
		try {
			exchangeMapper.AddNotice(params);
			resMap.put("RtnCode", SUCC_CODE);
			resMap.put("RtnMsg", "");
		} catch (Exception e) {
			m_Errmsg = e.getMessage();
			resMap.put("RtnCode", ERR_CODE);
			resMap.put("RtnMsg", getErrorMsg());
		}
		return resMap;
	}

	@Override
	public Map<String, Object> ProcessGjj101(int p_Func, String p_CardID, String p_OldCardID, String p_Name,
			String p_IDCard, String p_BankRegCode) throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_Func", p_Func);
			params.put("p_CardID", p_CardID);
			params.put("p_OldCardID", p_OldCardID);
			params.put("p_Name", p_Name);
			params.put("p_IDCard", p_IDCard);
			params.put("p_BankRegCode", p_BankRegCode);
			exchangeMapper.ProcessGjj101(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj102(TableParam p_SignInfo, String p_AprvCode, String p_BankRegCode)
			throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_SignInfo", p_SignInfo);
			params.put("p_AprvCode", p_AprvCode);
			params.put("p_BankRegCode", p_BankRegCode);
			exchangeMapper.ProcessGjj102(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj111(String p_CardID, String p_BankRegCode) throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_CardID", p_CardID);
			params.put("p_BankRegCode", p_BankRegCode);
			exchangeMapper.ProcessGjj111(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj112(String p_CardID, String p_StartDate, String p_EndDate)
			throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_CardID", p_CardID);
			params.put("p_StartDate", p_StartDate);
			params.put("p_EndDate", p_EndDate);
			exchangeMapper.ProcessGjj112(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj113(String p_CardID, String p_IDCard, String p_BankRegCode)
			throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_CardID", p_CardID);
			params.put("p_IDCard", p_IDCard);
			params.put("p_BankRegCode", p_BankRegCode);
			exchangeMapper.ProcessGjj113(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj114(String p_CardID, String p_IDCard, String p_StartDate, String p_EndDate)
			throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_CardID", p_CardID);
			params.put("p_IDCard", p_IDCard);
			params.put("p_StartDate", p_StartDate);
			params.put("p_EndDate", p_EndDate);
			exchangeMapper.ProcessGjj114(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}

	@Override
	public Map<String, Object> ProcessGjj115(String p_IDCard, String p_Name) throws ServiceException {
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("p_IDCard", p_IDCard);
			params.put("p_Name", p_Name);
			exchangeMapper.ProcessGjj115(params);
			return params;
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR, e.getMessage());
		}
	}
	
	@Override
	public void executeCnYhdztz() throws ServiceException {
		try {
			exchangeMapper.executeCnYhdztz();
		} catch (Exception e) {
			log.error("执行存储过程错误:", e);
			throw new ServiceException(ServiceErrorCode.EXCUTE_PROCEDURE_ERROR,"PKG_CN_YWJK.UPR_CN_YHDZTZ");
		}
	}

}
