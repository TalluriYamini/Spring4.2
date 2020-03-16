package com.jlc.spring;

public class Hello {
	private A aobj;
	private B bobj;
	
	public void setAobj(A aobj) {
		System.out.println("Hello-setAobj()");
		this.aobj = aobj;
	}
	
	public void setBobj(B bobj) {
		System.out.println("Hello-setBobj()");
		this.bobj = bobj;
	}

	public void show() {
		aobj.showA();
		bobj.showB();
	}
}
