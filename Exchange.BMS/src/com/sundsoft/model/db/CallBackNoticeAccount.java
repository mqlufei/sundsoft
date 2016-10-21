package com.sundsoft.model.db;

import java.util.List;

/// <summary>
/// 动账通知json对象
/// </summary>
public class CallBackNoticeAccount
{
    /// <summary>
    /// 批量流水号
    /// </summary>
	private String sendSeqNo; 

	private List<CallBackNoticeAccountDetail> data;

	
	public String getSendSeqNo() {
		return sendSeqNo;
	}

	
	public List<CallBackNoticeAccountDetail> getData() {
		return data;
	}

	
	public void setSendSeqNo(String sendSeqNo) {
		this.sendSeqNo = sendSeqNo;
	}

	
	public void setData(List<CallBackNoticeAccountDetail> data) {
		this.data = data;
	} 
    
    
}