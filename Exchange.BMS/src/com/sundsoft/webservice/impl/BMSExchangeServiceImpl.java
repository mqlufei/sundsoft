package com.sundsoft.webservice.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sundsoft.exception.ServiceException;
import com.sundsoft.model.db.CallBackBatch;
import com.sundsoft.model.db.CallBackBatchDetail;
import com.sundsoft.model.db.CallBackNoticeAccount;
import com.sundsoft.model.db.CallBackNoticeAccountDetail;
import com.sundsoft.model.db.CallBackQueryDetail;
import com.sundsoft.model.db.CallBackQueryDetailData;
import com.sundsoft.model.db.UtbBankTmpAccDetailVO;
import com.sundsoft.model.db.UtbTmpCnYhjslsxxVO;
import com.sundsoft.model.in.TableParam;
import com.sundsoft.service.bmsExchange.IExchangeService;
import com.sundsoft.utils.ResponseUtil;
import com.sundsoft.webservice.IBMSExchangeServices;

public class BMSExchangeServiceImpl implements IBMSExchangeServices {

	private static final Logger log = LogManager.getLogger(BMSExchangeServiceImpl.class);

	private Map<String, String> resMap = null;

	@Autowired
	private IExchangeService exchangeService;

	@Override
	public String SingleCallBack(String seqno, int state, String info, String hostseqno) {
		String m_ErrorInfo = null;
		String m_RtnCode = null;
		String m_Type = seqno.substring(0, 2);
		try {
			switch (m_Type) {
			case "FF":
				resMap = exchangeService.CallbackLoandeductSinglePayment(seqno, state, info, hostseqno);
				m_RtnCode = resMap.get("RtnCode");
				break;
			case "TK":
				resMap = exchangeService.CallbackPrePay(seqno, state, info, hostseqno);
				m_RtnCode = resMap.get("RtnCode");
				break;
			case "DZ":
				resMap = exchangeService.CallbackGaSinglePay(seqno, state, info, hostseqno);
				m_RtnCode = resMap.get("RtnCode");
				break;
			case "ZZ":
				resMap = exchangeService.CallbackTranMoney(seqno, state, info, hostseqno);
				m_RtnCode = resMap.get("RtnCode");
				break;
			default:
				m_RtnCode = "-2";
				m_ErrorInfo = String.format("未能找到类型:%s对应的处理方法", m_Type);
				break;
			}
		} catch (Exception e) {
			log.error("SingleCallBack error : ", e);
			m_ErrorInfo = "-1";
		}
		if (!m_RtnCode.equals("-2")) {
			m_ErrorInfo = resMap.get("RtnMsg");
		}
		return "{ 'rtnCode':'" + m_RtnCode + "','rtnMessage':'" + m_ErrorInfo + "'}";
	}

	@Override
	public String BatchCallBack(String jsonResult) {
		String m_RtnCode = null;
		String m_ErrorInfo = null;
		CallBackBatch batch = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			batch = mapper.readValue(jsonResult, new TypeReference<CallBackBatch>() {
			});
			String m_BatchSerial = batch.getBatchRefSeqNo();
			Element m_Xd = DocumentHelper.createElement("Table");
			Document document = DocumentHelper.createDocument(m_Xd);
			for (CallBackBatchDetail detail : batch.getData()) {
				Element m_Row = m_Xd.addElement("Rows");

				Element m_No = m_Row.addElement("No");
				m_No.setText(detail.getNo().trim());

				Element m_Amt = m_Row.addElement("Amt");
				m_Amt.setText(detail.getRtnCode().trim() == "00000" ? detail.getAmt().trim() : "0");

				Element m_Info = m_Row.addElement("Info");
				m_Info.setText(detail.getRtnMessage().trim());

				Element m_HostSeqNo = m_Row.addElement("HostSeqNo");
				m_HostSeqNo.setText(detail.getHostSeqNo().trim());

				Element m_BatState = m_Row.addElement("BatState");
				m_BatState.setText(detail.getRtnCode().trim() == "00000" ? "2" : "3");
			}
			String m_Type = batch.getBatchRefSeqNo().substring(0, 2);
			switch (m_Type) {
			case "KK":
				resMap = exchangeService.CallBackBatchPay(m_BatchSerial, document.asXML());
				m_RtnCode = resMap.get("RtnCode");
				break;
			case "ZQ":
				resMap = exchangeService.CallBackGaBatchPay(m_BatchSerial, document.asXML());
				m_RtnCode = resMap.get("RtnCode");
				break;
			default:
				m_RtnCode = "-2";
				m_ErrorInfo = String.format("未能找到%s对应的处理方法", m_Type);
				break;
			}
			if (!m_RtnCode.equals("-2")) {
				m_ErrorInfo = resMap.get("RtnMsg");
			}
			return "{ 'rtnCode':'" + m_RtnCode + "','rtnMessage':'" + m_ErrorInfo + "'}";
		} catch (Exception ex) {
			m_ErrorInfo = String.format("处理发生异常，错误消息：%s", ex.getMessage());
			return "{ 'rtnCode':'-3','rtnMessage':'" + m_ErrorInfo + "'}";
		}
	}

	@Override
	public String QueryBalanceCallBack(String seqno, int state, String info, String acctBal, String acctRestBal,
			String acctOverBal, String acctStatus) {
		String m_ErrorInfo = null;
		try {
			Double m_AcctBal, m_AcctRestBal, m_AcctOverBal;
			m_AcctBal = Double.parseDouble(acctBal);
			m_AcctRestBal = Double.parseDouble(acctRestBal);
			m_AcctOverBal = Double.parseDouble(acctOverBal);
			resMap = exchangeService.CallbackQueBalance(seqno, state, info, m_AcctBal, m_AcctRestBal, m_AcctOverBal,
					acctStatus);
			String m_RtnCode = resMap.get("RtnCode");
			m_ErrorInfo = resMap.get("RtnMsg");
			return "{ 'rtnCode':'" + m_RtnCode + "','rtnMessage':'" + m_ErrorInfo + "'}";
		} catch (Exception ex) {
			m_ErrorInfo = String.format("处理发生异常，错误消息：%s", ex.getMessage());
			return "{ 'rtnCode':'-3','rtnMessage':'" + m_ErrorInfo + "'}";
		}
	}

	@Override
	public String QueryAccDetailCallBack(String jsonResult) {
		String m_ErrorInfo = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			CallBackQueryDetail m_Detail = mapper.readValue(jsonResult, new TypeReference<CallBackQueryDetail>() {
			});
			// 查询成功的时候，将明细集合转成datatable存入临时表
			if (m_Detail.getTradeStatus() == 1) {
				List<UtbBankTmpAccDetailVO> dataList = new ArrayList<UtbBankTmpAccDetailVO>();
				UtbBankTmpAccDetailVO vo = null;
				for (CallBackQueryDetailData detail : m_Detail.getData()) {
					vo = new UtbBankTmpAccDetailVO();
					vo.setNO(detail.getNo());
					vo.setACCTNO(detail.getAcctNo());
					vo.setHOSTSEQNO(detail.getHostSeqNo());
					vo.setTRADECODE(detail.getTradeCode());
					vo.setTRADEACCTNO(detail.getTradeAcctNo());
					vo.setTRADEACCTNAME(detail.getTradeAcctName());
					vo.setAMT(Double.parseDouble(detail.getAmt()));
					vo.setTRADEDATE(detail.getTradeDate());
					vo.setTRADETIME(detail.getTradeTime());
					vo.setRESTBAL(Double.parseDouble(detail.getRestBal()));
					vo.setACCORGNO(detail.getAccOrgNo());
					vo.setREMARK(detail.getRemark());
					vo.setCURRNO(detail.getCurrNo());
					vo.setCURRIDEN(detail.getCurrIden());
					vo.setBALANCE(Double.parseDouble(detail.getBalance()));
					vo.setOVERBAL(Double.parseDouble(detail.getOverBal()));
					vo.setCREDENCETYPE(detail.getCredenceType());
					vo.setCREDENCENO(detail.getCredenceNo());
					vo.setTRADERIVALNO(detail.getTradeRivalNo());
					vo.setSUMMARY(detail.getSummary());
					vo.setCORRECTIDEN(detail.getCorrectIden());
					vo.setPENNO(detail.getPenNo());
					vo.setCENO(detail.getCeNo());
					vo.setREFSEQNO(m_Detail.getRefSeqNo());
					dataList.add(vo);
				}
				if (!exchangeService.SaveDetailResultToTemp(dataList)) {
					return "{ 'rtnCode':'-1','rtnMessage':'批量存入临时表失败,错误消息：'" + exchangeService.getErrorMsg() + "}";
				}
			}
			resMap = exchangeService.CallbackQueDetail(m_Detail.getRefSeqNo(), m_Detail.getTradeStatus(),
					m_Detail.getRtnMessage());
			String m_RtnCode = resMap.get("RtnCode");
			m_ErrorInfo = resMap.get("RtnMsg");
			return "{ 'rtnCode':'" + m_RtnCode + "','rtnMessage':'" + m_ErrorInfo + "'}";
		} catch (Exception ex) {
			m_ErrorInfo = String.format("处理发生异常，错误消息：%s", ex.getMessage());
			return "{ 'rtnCode':'-3','rtnMessage':'" + m_ErrorInfo + "'}";
		}
	}

	@Override
	public String NoticeAccCallBack(String jsonResult) {
		String m_ErrorInfo = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			CallBackNoticeAccount m_Notice = mapper.readValue(jsonResult, new TypeReference<CallBackNoticeAccount>() {
			});
			String m_SendSeqNo = m_Notice.getSendSeqNo();
			List<UtbTmpCnYhjslsxxVO> dataList = new ArrayList<UtbTmpCnYhjslsxxVO>();
			for (CallBackNoticeAccountDetail m_Data : m_Notice.getData()) {
				UtbTmpCnYhjslsxxVO vo = new UtbTmpCnYhjslsxxVO();
				vo.setSENDSEQNO(m_SendSeqNo);
				vo.setYHJSLSH(m_Data.getHostSeqNo());
				vo.setFSE(m_Data.getAmt());
				vo.setJSFSRQ(m_Data.getTradeDate());
				vo.setZHAIYAO(m_Data.getSummary());
				vo.setYHZHHM(m_Data.getAcctNo());
				vo.setYHDM("");
				vo.setZHHM(m_Data.getTradeAcctNo());
				vo.setZHMC(m_Data.getTradeAcctName());
				vo.setTRADETYPE(m_Data.getAmt() > 0 ? "1" : "0");
				dataList.add(vo);
			}
			if (!exchangeService.SaveNoticeToTemp(dataList)) {
				return "{ 'rtnCode':'-1','rtnMessage':'批量存入临时表失败,错误消息：'" + exchangeService.getErrorMsg() + "}";
			}
			resMap = exchangeService.AddNotice(m_Notice.getSendSeqNo());
			
			String m_RtnCode = resMap.get("RtnCode");
			m_ErrorInfo = resMap.get("RtnMsg");
			return "{ 'rtnCode':'" + m_RtnCode + "','rtnMessage':'" + m_ErrorInfo + "'}";
		} catch (Exception ex) {
			m_ErrorInfo = String.format("处理发生异常，错误消息：%s", ex.getMessage());
			return "{ 'rtnCode':'-3','rtnMessage':'" + m_ErrorInfo + "'}";
		}
	}

	@Override
	public int CallBackSingleCollection() {
		return 1;
	}

	@Override
	public String GJJ101_SignAndUnSign(int p_Func, String p_CardID, String p_OldCardID, String p_Name, String p_IDCard,
			String p_BankRegCode) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj101(p_Func, p_CardID, p_OldCardID, p_Name, p_IDCard,
					p_BankRegCode);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ101_SignAndUnSign error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String GJJ102_BatchSign(TableParam p_SignInfo, String p_AprvCode, String p_BankRegCode) {
		return null;
	}

	@Override
	public String GJJ111_GaBalanceQuery(String p_CardID, String p_BankRegCode) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj111(p_CardID, p_BankRegCode);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ111_GaBalanceQuery error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String GJJ112_GaDetailQuery(String p_CardID, String p_StartDate, String p_EndDate) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj112(p_CardID, p_StartDate, p_EndDate);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ112_GaDetailQuery error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String GJJ113_LoanBalanceQuery(String p_CardID, String p_IDCard, String p_BankRegCode) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj113(p_CardID, p_IDCard, p_BankRegCode);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ113_LoanBalanceQuery error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String GJJ114_LoanDetailQuery(String p_CardID, String p_IDCard, String p_StartDate, String p_EndDate) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj114(p_CardID, p_IDCard, p_StartDate, p_EndDate);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ114_LoanDetailQuery error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

	@Override
	public String GJJ115_IndvInfoQuery(String p_IDCard, String p_Name) {
		try {
			Map<String, Object> res = exchangeService.ProcessGjj115(p_IDCard, p_Name);
			String rtnCode = (String) res.get("OUT_CODE");
			String rtnMessage = (String) res.get("OUT_MESSAGE");
			Object data = res.get("OUT_DATA");
			return ResponseUtil.succ(rtnCode, rtnMessage, data);
		} catch (ServiceException e) {
			log.error("GJJ115_IndvInfoQuery error:" + e.getMessage(), e);
			return ResponseUtil.err(e.getErrCode(), e.getMessage());
		}
	}

}
