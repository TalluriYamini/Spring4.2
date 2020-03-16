package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring COntaines is Ready");
		System.out.println("-------------");

		Hello h = (Hello) ctx.getBean("hello");
		Hello h1 = (Hello) ctx.getBean("hello1");
		System.out.println(h == h1);
	}
}
