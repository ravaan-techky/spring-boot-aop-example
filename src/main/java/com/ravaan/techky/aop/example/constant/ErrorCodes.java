package com.ravaan.techky.aop.example.constant;

public enum ErrorCodes {
	RECORD_NOT_FOUND(1),
	
	INTERNAL_SERVER_ERROR(2);
	
	private Integer errorCode;
	
	private ErrorCodes(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getErrorCode() {
		return errorCode;
	}
}
