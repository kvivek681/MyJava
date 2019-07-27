package com.vivek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="helloworld")
public class HelloWorldBean {
	String msg;
	@Autowired
	@Qualifier("hb2")
	HelloIndiaBean hb;
	
	/*
	 * public HelloWorldBean(HelloIndiaBean hb,String msg) { super(); this.hb=hb;
	 * this.msg = msg; }
	 */

	public String getMsg() {
		return msg;
	}
	@Required
	@Value("Hello World!!")
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
