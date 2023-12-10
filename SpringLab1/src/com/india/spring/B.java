package com.india.spring;

public class B {
	
	private int b;
	private String str;
	public B(String str) {
		
		this.str = str;
	}
	
	
	public void setB(int b) {
		this.b = b;
	}



	public void showB() {
		System.out.println("B-showB()");
		System.out.println(b);
		System.out.println(str);
	}
	
	

}
