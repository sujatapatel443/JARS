package com.sp.exceptionhandling;

public class NestedTryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			System.out.println("try block 1 started  ");
			try {
				System.out.println("try block 2 started");
				
			}catch(Exception ex) {
				System.out.println("catch block");
			}finally {
				System.out.println("Finally block");
				
			}
			System.out.println("Out side of finally block");
		}catch(Exception ex) {
			System.out.println("catch block 2 started");
		}finally {
			System.out.println("Finally block 2");
		}System.out.println("Out side offinaly block 2");

	}/*finally {
		System.out.println("");
	}try {
		System.out.println("try block started");
	}catch(Exception ex) {
		System.out.println("catch block 3 started");
	}finally {
		System.out.println("Finally block 4 started");
	}*/
		
	

}
