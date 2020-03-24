package com.jlc.spring;

public class A {
	private int a;
	private String msg;

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getA() {
		return a;
	}

	public String getMsg() {
		return msg;
	}

	public String toString() {
		return "" + a + "\t" + msg;
	}
}
