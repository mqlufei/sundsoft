package com.sundsoft.model.db;

import java.util.List;

/// <summary>
/// 批量交易回调类
/// </summary>
public class CallBackBatch
{
    

    /// <summary>
    /// 批量流水号
    /// </summary>
	private String batchRefSeqNo; 

    /// <summary>
    /// 交易明细数据
    /// </summary>
	private List<CallBackBatchDetail> data ;

	
	public String getBatchRefSeqNo() {
		return batchRefSeqNo;
	}

	
	public List<CallBackBatchDetail> getData() {
		return data;
	}

	
	public void setBatchRefSeqNo(String batchRefSeqNo) {
		this.batchRefSeqNo = batchRefSeqNo;
	}

	
	public void setData(List<CallBackBatchDetail> data) {
		this.data = data;
	}
    
}