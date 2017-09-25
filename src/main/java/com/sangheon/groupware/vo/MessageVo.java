package com.sangheon.groupware.vo;

public class MessageVo extends UserVo{
	private String senderemployeeNo;
	private String receiverEmail;
	private String message;
	private String receiverEmployeeNo;
	private String senderEmployeeNo;
	private String messageContent;
	private String writeDate;
	private String sender;
	
	
	
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiverEmployeeNo() {
		return receiverEmployeeNo;
	}
	public void setReceiverEmployeeNo(String receiverEmployeeNo) {
		this.receiverEmployeeNo = receiverEmployeeNo;
	}
	public String getSenderEmployeeNo() {
		return senderEmployeeNo;
	}
	public void setSenderEmployeeNo(String senderEmployeeNo) {
		this.senderEmployeeNo = senderEmployeeNo;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
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
