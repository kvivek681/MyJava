package com.vivek;

import org.springframework.beans.factory.annotation.Required;

public class HelloIndiaBean {
	
	private String msg;
	
	public HelloIndiaBean() {
		super();
		System.out.println("HelloIndiaBean Object Created.");
	}

	public String getMsg() {
		return msg;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloIndiaBean [msg=" + msg + "]";
	}

	
	
	

}
