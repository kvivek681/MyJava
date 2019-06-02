package com.vivek;

import org.springframework.beans.factory.annotation.Required;

public class HelloWorldBean {
	String msg;
	HelloIndiaBean hb;
	
	/*
	 * public HelloWorldBean(HelloIndiaBean hb,String msg) { super(); this.hb=hb;
	 * this.msg = msg; }
	 */

	public String getMsg() {
		return msg;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}

	
	
	

	public HelloIndiaBean getHb() {
		return hb;
	}

	public void setHb(HelloIndiaBean hb) {
		this.hb = hb;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + ", hb=" + hb + "]";
	}

	public void init() {
		System.out.println("Bean method initialsation Started!!");
	}
	
	public void destroy() {
		System.out.println("Bean method destruction Started!!");
	}

}
