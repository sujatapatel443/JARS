package com.sp.exceptionhandling;

public class Exception2 {

	public static void main(String[] args) throws ArraayIndexOutOfBoundException {
		System.out.println("Main started");
		try {
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result is :"+res);
			
			}catch(NumberFormatException ex) {
				System.out.println(ex);
			}catch(ArithmeticException ex) {
				System.out.println(ex);
			}catch(Exception ex) {
				System.out.println(ex);
			}
		finally {
			System.out.println("Thank you for writing finally block");
		}
		System.out.println("Main completed");
	}

}
