package com.jlc.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab35 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("....Spring Container is now Ready...");
		Hello hello = (Hello) ctx.getBean("HELLO"); // byType
		hello.show();
		System.out.println("---------------");
		System.out.println("Spring Container going to shutdown...");
		ctx.registerShutdownHook();

	}
}

//when no beans is found with matching data type then bean property will not be injected