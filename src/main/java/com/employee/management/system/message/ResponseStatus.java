package com.employee.management.system.message;

public class ResponseStatus {
	
	
	public String status;
	
	public String messag="";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessag() {
		return messag;
	}

	public void setMessag(String messag) {
		this.messag = messag;
	}

	public ResponseStatus(String statusOk, String messag) {
		super();
		this.status = statusOk;
		this.messag = messag;
	}	
	
	
	
	
	
	
}
