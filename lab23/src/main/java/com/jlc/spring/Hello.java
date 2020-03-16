package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {
	
	@Autowired
	private A aobj;

	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj()");
		this.aobj = aobj;
	}

	public void show() {
		System.out.println(aobj);
	}
}
