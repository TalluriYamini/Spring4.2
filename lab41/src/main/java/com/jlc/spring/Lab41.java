package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab41 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		TestBean tb = (TestBean) ctx.getBean("test");
		tb.showEnglish();
		tb.showHindi();
	}
}

//when no beans is found with matching data type then bean property will not be injected