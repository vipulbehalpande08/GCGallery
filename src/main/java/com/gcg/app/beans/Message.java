package com.gcg.app.beans;

public class Message {

	private StatusCode statusCode;
	private String statusMessage;
	private int id;
	public StatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
