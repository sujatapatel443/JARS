package com.sp.exceptionhandling;

import java.rmi.ConnectException;

public class ExceptionInstanceOf {

	public static void main(String[] args) {
		Exception ex1=new ClassNotFoundException();
		Exception ex2=new NullPointerException();
		System.out.println(ex1 instanceof RuntimeException);
		System.out.println(ex2 instanceof RuntimeException);
		System.out.println(ex1 instanceof Throwable);
		Exception ex3=new NumberFormateException();
		Exception ex4=new ArithmeticException();
		System.out.println("****************************************");
		System.out.println(ex3 instanceof RuntimeException);
		System.out.println(ex4 instanceof RuntimeException);
		System.out.println(ex3==ex4);
		System.out.println(ex3.equals(ex4));
		
		try {
			int res=10/0;
			
		}catch(ArithmeticException ex){
			System.out.println(ex);
			
		}finally {
			System.out.println("finally catch block handle ArithmeticException");
		}

	}

}
