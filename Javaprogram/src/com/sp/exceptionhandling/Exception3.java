package com.sp.exceptionhandling;

public class Exception3 {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException, NumberFormateException  {
		System.out.println("Main started");
		try {
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result is :"+res);
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException ex) {
			System.out.println(ex);
		}
		System.out.println("Main completed");

	}

}
