package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab22 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) ctx.getBean("hello");
		hello.show();
	}
}

//when no beans is found with matching data type then bean property will not be injected