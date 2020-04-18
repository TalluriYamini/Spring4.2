package com.jlc.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab62 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");

		// 1.addCustomer
		System.out.println("addCustomer");
		CustomerTo cto = new CustomerTo(7, "yam", "yam@gmail.com", 5555, "bnglr");
		cdao.addCustomer(cto);

		// 2.updateCustomer
		System.out.println("updateCustomer");
		CustomerTo cto1 = new CustomerTo(219, "sar", "sar@gmail.com", 3333, "bnglr");
		cdao.updateCustomer(cto1);

		// 3.deleteCustomer
		cdao.deleteCustomer(308);

		System.out.println("check your database");

		// 4.getCustomerByCid
		System.out.println("getCustomerByCid");
		cto = cdao.getCustomerByCid(302);
		System.out.println(cto);
	}
}
