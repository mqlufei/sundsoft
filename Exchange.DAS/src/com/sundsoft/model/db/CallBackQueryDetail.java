package com.sundsoft.model.db;

import java.util.List;

/// <summary>
/// CallBackQueryDetail 的摘要说明
/// </summary>
public class CallBackQueryDetail
{
    /// <summary>
    /// 流水号
    /// </summary>
    private String refSeqNo ;

    /// <summary>
    /// 交易状态
    /// </summary>
    private int tradeStatus ;

    /// <summary>
    /// 返回消息
    /// </summary>
    private String rtnMessage ;
    
    private String sendSeqNo;
    
    private String txCode;

    private List<CallBackQueryDetailData> data ;

	
	public String getRefSeqNo() {
		return refSeqNo;
	}

	
	public int getTradeStatus() {
		return tradeStatus;
	}

	
	public String getRtnMessage() {
		return rtnMessage;
	}

	
	public List<CallBackQueryDetailData> getData() {
		return data;
	}

	
	public void setRefSeqNo(String refSeqNo) {
		this.refSeqNo = refSeqNo;
	}

	
	public void setTradeStatus(int tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	
	public void setRtnMessage(String rtnMessage) {
		this.rtnMessage = rtnMessage;
	}

	
	public void setData(List<CallBackQueryDetailData> data) {
		this.data = data;
	}


	public String getSendSeqNo() {
		return sendSeqNo;
	}


	public void setSendSeqNo(String sendSeqNo) {
		this.sendSeqNo = sendSeqNo;
	}


	public String getTxCode() {
		return txCode;
	}


	public void setTxCode(String txCode) {
		this.txCode = txCode;
	} 
    
    
}