package com.example.SpringBootEmail;

public class UserEmail {

	private String recipent;
	private String msgBody;
	private String subject;
	
	public String getRecipent() {
		return recipent;
	}
	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String mdgBody) {
		this.msgBody = mdgBody;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
