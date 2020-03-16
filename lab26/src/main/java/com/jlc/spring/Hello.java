package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	private A aobj;
	private B bobj;

	@Autowired
	public Hello(A ao, B bo) {
		this.aobj = ao;
		this.bobj = bo;
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
