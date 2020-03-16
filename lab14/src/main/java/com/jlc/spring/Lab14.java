package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab14 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		Hello hello = (Hello) ctx.getBean("hello");
		hello.show();
	}
}
