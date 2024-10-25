package com.ckeck.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Message {
	
	private String senderName;
	
	private String reciverName;
	
	private String message;
	
	private String Date;
	
	private status status;
	
	

	public Message() {
		super();
	}

	public Message(String senderName, String reciverName, String message, String date, com.ckeck.Model.status status) {
		super();
		this.senderName = senderName;
		this.reciverName = reciverName;
		this.message = message;
		Date = date;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Message [senderName=" + senderName + ", reciverName=" + reciverName + ", message=" + message + ", Date="
				+ Date + ", status=" + status + "]";
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReciverName() {
		return reciverName;
	}

	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public status getStatus() {
		return status;
	}

	public void setStatus(status status) {
		this.status = status;
	}
	
	

}
