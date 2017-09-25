package com.sangheon.groupware.vo;

public class MessageVo extends UserVo{
	private String senderemployeeNo;
	private String receiverEmail;
	private String message;
	
	public String getSenderemployeeNo() {
		return senderemployeeNo;
	}
	public void setSenderemployeeNo(String senderemployeeNo) {
		this.senderemployeeNo = senderemployeeNo;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
