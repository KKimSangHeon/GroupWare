package com.sangheon.groupware.dto;

public class JSONResult {
	private String result;  //"success" or "fail"
	private String message; // result 가 "fail"인 경우 원인 메세지
	private Object data;    // result 가 "success"인 경우 전달할 데이터

	private JSONResult(String result, String message, Object data) {
		this.result = result;
		this.message = message;
		this.data = data;
	}
	
	public static JSONResult success( Object data ) {
		return new JSONResult( "success", null, data );
	}

	public static JSONResult fail( String message ) {
		return new JSONResult( "fail", message, null );
	}
	
	public String getResult() {
		return result;
	}
	public String getMessage() {
		return message;
	}
	public Object getData() {
		return data;
	}
}
