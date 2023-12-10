package com.sp.exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			
			int res=10/3;
			System.out.println("Result is : "+res);
			
			
		}catch(Exception ex) {
			System.out.println("Invalid input");
			
		}finally {
			System.out.println("Finally Block");
			System.out.println("Main completed");
			
		}
		

	}

}
