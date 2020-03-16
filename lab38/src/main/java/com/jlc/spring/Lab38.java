package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab38 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean tb = (TestBean) ctx.getBean("test");
		tb.show();
	}
}

//when no beans is found with matching data type then bean property will not be injected