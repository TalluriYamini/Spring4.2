package com.jlc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		
		//without IOC
		A aobj = new A();
		aobj.setA(99);
		aobj.setMsg("Hello Guys");
		B bobj = new B(88,"Hao Guys");
		Hello hello = new Hello(bobj);
		hello.setAobj(aobj);
		//hello.show();
		System.out.println("----------------------Without IOC");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Spring COntaines is Ready");
		System.out.println("-------------");
		Hello h = (Hello) ctx.getBean("hello");
		h.show();
	}
}
