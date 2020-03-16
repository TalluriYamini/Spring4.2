package com.jlc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab43 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		Student stu = (Student) ctx.getBean("student");
		System.out.println(stu.getSid().getBid());
		System.out.println(stu.getSid().getSid());
		System.out.println(stu.getSname());
		System.out.println(stu.getPhone());
		System.out.println(stu.getFee().getFeeBal());
		System.out.println(stu.getFee().getFeepaid());
		System.out.println(stu.getFee().getTotalFee());
		System.out.println(stu.getEmails());
		System.out.println(stu.getPhones());
	}
}

//when no beans is found with matching data type then bean property will not be injected