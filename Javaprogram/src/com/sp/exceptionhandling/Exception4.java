package com.sp.exceptionhandling;

public class Exception4 {

	public static void main(String[] args) throws ArraayIndexOutOfBoundException {
		System.out.println("Main started");
		String data = null;
		try {
			data = args[0];
			int res = 10 / 0;
			System.out.println("Result is :" + res);

		} finally {
			System.out.println("Welcome in finally block");
		}
		int x = 0;
		try {
			x = Integer.parseInt(data);
		} catch (NumberFormatException ex) {
			System.out.println("invalid input,please enter valid number ");
		}
		try {
			int res = 10 / 0;
			System.out.println("Result is :" + res);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		finally {
			System.out.println("thank you friend");
		}
		System.out.println("main completed");

	}
}
