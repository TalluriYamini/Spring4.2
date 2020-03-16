package com.jlc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab33 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
		System.out.println("....Spring Container is now Ready...");
		Hello hello = (Hello) ctx.getBean(Hello.class); //byType
		hello.show();
		Hai hai = (Hai) ctx.getBean(Hai.class);
		hai.show();
	}
}

//when no beans is found with matching data type then bean property will not be injected