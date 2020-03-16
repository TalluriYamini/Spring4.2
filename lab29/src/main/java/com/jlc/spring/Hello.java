package com.jlc.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello {

	@Autowired(required = false)  //Declares whether the annotated dependency is required. Default it is true 
	private A aobj;

	@Autowired(required = false)
	private B bobj;

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
