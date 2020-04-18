package com.jlc.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab57 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		// 1.selectaddCustomer
		CustomerTo cto = new CustomerTo(302, "srini", "sri2@jlc.com", 9999, "bnglr");
		cdao.addCustomer(cto);
		// 2.updateCustomer
		CustomerTo cto1 = new CustomerTo(203, "abcd", "abcd@jlc.com", 8888, "bnglr");
		cdao.updateCustomer(cto1);
		// 3.deleteCustomer
		cdao.deleteCustomer(300);
		System.out.println("Check Your Database");

	}
}
