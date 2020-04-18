package com.jlc.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab60 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1.addCustomer
		System.out.println("addCustomer");
		CustomerTo cto = new CustomerTo(209, "jlc", "jlc@jlc", 6666, "bnglr");
		cdao.addCustomer(cto);
		
		
		// 5.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTo> list = cdao.getAllCustomers();
		for (CustomerTo ct : list) {
			System.out.println(ct);
		}

	}
}
