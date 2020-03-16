package com.jlc.spring;

public class Hello {
	private A aobj;
	private B bobj;

	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj");
		this.aobj = aobj;
	}

	public Hello(B bobj) {
		System.out.println("Hello-1arg");
		this.bobj = bobj;
	}

	public void show() {
		System.out.println("show in Hello");
		aobj.showA();
		bobj.showB();
	}
}
