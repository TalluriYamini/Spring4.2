package com.jlc.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab59 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1.addCustomer
		System.out.println("addCustomer");
		CustomerTo cto = new CustomerTo(304, "Manish", "manish@jlc", 9999, "bnglr");
		cdao.addCustomer(cto);
		// 2.updateCustomer
		System.out.println("updateCustomer");
		CustomerTo cto1 = new CustomerTo(203, "vas", "vas@jlc", 7777, "bnglr");
		cdao.updateCustomer(cto1);

		// 3.deleteCustomer
		System.out.println("deleteCustomer");
		cdao.deleteCustomer(106);

		// 4.getCustomersByCid
		System.out.println("getCustomersByCid");
		CustomerTo cto2 = cdao.getCustomerByCid(301);
		System.out.println(cto2);
		// 5.getAllCustomers
		System.out.println("getAllCustomers");
		List<CustomerTo> list = cdao.getAllCustomers();
		for (CustomerTo ct : list) {
			System.out.println(ct);
		}

	}
}
