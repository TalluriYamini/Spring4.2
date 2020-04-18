package com.jlc.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab56 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		// 1.selectaddCustomer
		CustomerTo cto = new CustomerTo(301, "srini", "sri2@jlc.com", 9999, "bnglr");
		cdao.addCustomer(cto);
		// 2.updateCustomer
		CustomerTo cto1 = new CustomerTo(106, "abcd", "vas@jlc.com", 8888, "bnglr");
		cdao.updateCustomer(cto1);
		// 3.deleteCustomer
		cdao.deleteCustomer(107);
		System.out.println("Check Your Database");

	}
}
