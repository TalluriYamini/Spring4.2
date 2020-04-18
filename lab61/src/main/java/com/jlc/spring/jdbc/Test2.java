package com.jlc.spring.jdbc;

interface A {

}

class A1 {
	void show() {
		System.out.println("1234");
	}
}

public class Test2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		A1 a = new A1();
		Test2 t = new Test2();
		Test2 t2 = (Test2) t.clone();

		System.out.println(t2);

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Test2) super.clone();
	}
}
