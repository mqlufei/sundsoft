package com.sundsoft.exception;

public enum ServiceErrorCode {
	DEFAULT("-1", "默认，无具体信息"), //
	SYSTEM_ERROR("0001", "系统异常{0}"), //
	PROPERTY_ERROR("0002", "系统配置有误"), //
	NEED_MORE_DATA("0003", "{0}"), //
	JSON_PRASE_EXCEPTION("0004","json转化异常"),//
	INTERFACE_ERROR("0005","接口访问失败"),
	EXCUTE_PROCEDURE_ERROR("E300","执行存储过程异常{0}"),
	INSERT_TEMP_ERROR("E102","保存临时表异常{0}")
	;

	private String code;

	private String defaultMessage;

	ServiceErrorCode(String code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}

	public String getErrorCode() {
		return this.code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}
}
