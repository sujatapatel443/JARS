package com.sp.exceptionhandling;

public class Lab558 {

	public static void main(String[] args) {
		System.out.println("Main started");
		int r=new Hello().show();
		System.out.println("Main "+r);
		System.out.println("Main completed");
		
		

	}

}
class Hello{
	int show() {
		int a=0;
		try {
			System.out.println("Try Block begin :"+a);
			a=10/0;
			System.out.println("Try Block ends :"+a);
			return a;
			
		}catch(ArithmeticException ex){
			a=20;
			System.out.println("Catch Block started :"+a);
			return a;
		}finally {
			System.out.println("Finally Block :"+a);
			//int arr[]=new int [-1];
			return 4;
		}
		
	}
}
