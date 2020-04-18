package com.jlc.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab66 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1.addCustomer
		System.out.println("addCustomer");
		CustomerTo cto = new CustomerTo(10, "yam", "yam@gmail.com", 5555, "bnglr");
		cdao.addCustomer(cto);
		System.out.println("Check your database");
	}
}
