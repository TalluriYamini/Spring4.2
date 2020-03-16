package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab4 {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		System.out.println("Spring COntaines is Ready");
		System.out.println("-------------");

		Hello h = (Hello) ctx.getBean("hello");
		Hello h1 = (Hello) ctx.getBean("hello");
		System.out.println(h == h1);
	}
}
