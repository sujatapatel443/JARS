package com.india.spring;

public class A{
	private int a;
	
	private String msg;
	
	public A(int a, String msg) {
		this.a=a;
		this.msg=msg;
		
	}


	public void showA() {
		System.out.println("A-showA()");
		System.out.println(a);
		System.out.println(msg);
	}
	

}
