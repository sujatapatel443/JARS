package com.sp.logicalprogram;

public class SwapTheNum {

	public static void main(String[] args) {
		
		/*
		 * int a=10; int b=20;
		 */
		
		SwapTheNum.swapOfNum(3, 5);
		
	}
	
	public static void swapOfNum(int a,int b) {
		int c=0;
		System.out.println("a : "+a+"\t"+"b : "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("a : "+a+"\t"+"b : "+b);

		
	}

}
