package com.sp.exceptionhandling;

public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main started");
		new Hello1().show("0");

	}

}

class Hello1 {
	void show(String str) {
		System.out.println("show() called");
		try {
			System.out.println("try block started");
			int a = Integer.parseInt("6");
			int b = 10 / a;
			System.out.println(b);
			System.out.println("try block completed :" + b);
			
		} catch (ArithmeticException ex) {
			int a = 30;
			System.out.println("catch block");
			System.exit(0);
			

		} finally {
			System.out.println("finally block");
		

		}
	}
}