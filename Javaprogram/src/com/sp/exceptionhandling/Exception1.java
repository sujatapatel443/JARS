package com.sp.exceptionhandling;

import java.text.NumberFormat;

public class Exception1 {

	public static void main(String[] args)  {
		System.out.println("Main started...");
		try {
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result is :"+res);
		}
		//catch(NumberFormat ex) {
			//System.out.println(ex);
		//}
		catch(ArithmeticException ex) {
			System.out.println(ex);
			
		}
		catch(Exception ex){
			System.out.println(ex);
			
		}
		finally
		{
			System.out.println("fanally block"); 
				
		}
		
	}

}
