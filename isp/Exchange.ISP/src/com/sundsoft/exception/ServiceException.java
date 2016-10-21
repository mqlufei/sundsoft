package com.sundsoft.exception;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 7946023196149777499L;

	protected static final String ERROR_BUNDLE = "i18n/errors";

	protected ServiceErrorCode errorCode;

	protected String realCode;

	private Object[] arguments;

	private Object dto;

	public ServiceErrorCode getErrorCode() {
		return errorCode;
	}

	public ServiceException(ServiceErrorCode errorCode, Object... arguments) {
		super();
		this.errorCode = errorCode;
		this.realCode = errorCode.getErrorCode();
		this.arguments = arguments;
	}

	public ServiceException(ServiceErrorCode errorCode, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.realCode = errorCode.getErrorCode();
	}

	public ServiceException(Object dto, Throwable cause) {
		super(cause);
		this.dto = dto;
	}

	public ServiceException(ServiceErrorCode errorCode, Object dto, Throwable cause) {
		super(cause);
		this.errorCode = errorCode;
		this.dto = dto;
	}

	/**
	 * 取得配置文件的内容，或者使用默认值
	 */
	@Override
	public String getMessage() {
		String notMessage = "not error, not message";
		if (errorCode == null || StringUtils.isBlank(realCode)) {
			return notMessage;
		}
		else {
			String defaultMessage = errorCode.getDefaultMessage();
			if (StringUtils.isBlank(defaultMessage)) {
				return notMessage;
			}
			else {
				return MessageFormat.format(defaultMessage, this.arguments);
			}

		}
	}

	public Object getDto() {
		return dto;
	}

	public void setDto(Object dto) {
		this.dto = dto;
	}

}
