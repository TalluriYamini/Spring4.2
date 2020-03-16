package com.jlc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab36 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("....Spring Container is now Ready...");
		Hello hello = (Hello) ctx.getBean("HELLO"); // byType
		hello.show();
		System.out.println("---------------");
		System.out.println("Spring Container going to shutdown...");
		ctx.registerShutdownHook();

	}
}

//when no beans is found with matching data type then bean property will not be injected