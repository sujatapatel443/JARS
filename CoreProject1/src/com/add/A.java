package com.add;

public class A {
	public static void main(String[] args) {
		int a=90;
		int b=75;
		
		B ref=new B();
		int result =ref.addB(a, b);
		
		System.out.println("Result :"+result);
	}

}
