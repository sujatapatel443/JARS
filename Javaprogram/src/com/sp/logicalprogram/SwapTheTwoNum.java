package com.sp.logicalprogram;

public class SwapTheTwoNum {
	static int c=0;
	public static void main(String[] args) {
		 
		Inter14 inter=(a,b)->{
			System.out.println("a = "+a+" b = "+b);
			c=a+b;
			a=b;
			b=c;
			System.out.println("a = "+a+" b = "+b);
			
		};
		inter.swap(3,5);
	
	}

}
interface Inter14{
	public void swap( int a,int b);
}
