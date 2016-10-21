package com.sundsoft.utils;

import net.sf.json.JSONObject;

public class ResponseUtil {

	private static JSONObject resJson = null;

	public static final String SUCC_CODE = "0000";

	public static final String SUCC_INFO = "交易成功";

	private static final String ERR_CODE = "-1";

	public static String succ() {
		resJson = new JSONObject();
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		return resJson.toString();
	}
	
	public static String succ(Object content) {
		resJson = new JSONObject();
		resJson.put("errorCode", SUCC_CODE);
		resJson.put("errorInfo", SUCC_INFO);
		resJson.put("content", content);
		return resJson.toString();
	}
	
	public static String err(String errorCode,String errorInfo) {
		resJson = new JSONObject();
		resJson.put("errorCode", errorCode);
		resJson.put("errorInfo", errorInfo);
		return resJson.toString();
	}
}
