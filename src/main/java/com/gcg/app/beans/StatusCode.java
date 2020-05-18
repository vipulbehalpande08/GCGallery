package com.gcg.app.beans;

public enum StatusCode {
	
	S201("Create or update successfully...!"),
	E201("Object is empty"),
	E202("Error on database"),
	E203("Exception on create...!"),
	ER("No data found"),
	UNAVAIL("Unavailable");
	
	
	public String value;
	private StatusCode(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
