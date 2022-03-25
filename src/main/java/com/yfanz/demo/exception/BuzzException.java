package com.yfanz.demo.exception;

public class BuzzException extends RuntimeException {
	private String message;
	private String reason;
	public BuzzException(String message, String reason) {
		super();
		this.message = message;
		this.reason = reason;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
