package com.vivek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorldBean hb=(HelloWorldBean) ap.getBean("helloWorld");
		System.out.println(hb);
		((ClassPathXmlApplicationContext)ap).close();
		

	}

}
