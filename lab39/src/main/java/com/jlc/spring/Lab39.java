package com.jlc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab39 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		TestBean tb = (TestBean) ctx.getBean("test");
		tb.show();
	}
}

//when no beans is found with matching data type then bean property will not be injected