package com.sundsoft.model.db;



/// <summary>
/// 批量交易回调类的明细数据
/// </summary>
public class CallBackBatchDetail
{
    /// <summary>
    /// 序号
    /// </summary>
	private String no; 

    /// <summary>
    /// 交易明细流水
    /// </summary>
	private String refSeqNo ;

    /// <summary>
    /// 交易金额
    /// </summary>
	private String amt; 

    /// <summary>
    /// 银行反馈的结算处理响应码
    /// </summary>
	private String rtnCode ;

    /// <summary>
    /// 交易信息
    /// </summary>
	private String rtnMessage; 

    /// <summary>
    /// 银行交易主机号
    /// </summary>
	private String hostSeqNo;

	
	public String getNo() {
		return no;
	}

	
	public String getRefSeqNo() {
		return refSeqNo;
	}

	
	public String getAmt() {
		return amt;
	}

	
	public String getRtnCode() {
		return rtnCode;
	}

	
	public String getRtnMessage() {
		return rtnMessage;
	}

	
	public String getHostSeqNo() {
		return hostSeqNo;
	}

	
	public void setNo(String no) {
		this.no = no;
	}

	
	public void setRefSeqNo(String refSeqNo) {
		this.refSeqNo = refSeqNo;
	}

	
	public void setAmt(String amt) {
		this.amt = amt;
	}

	
	public void setRtnCode(String rtnCode) {
		this.rtnCode = rtnCode;
	}

	
	public void setRtnMessage(String rtnMessage) {
		this.rtnMessage = rtnMessage;
	}

	
	public void setHostSeqNo(String hostSeqNo) {
		this.hostSeqNo = hostSeqNo;
	} 
    
    
}