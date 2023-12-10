package com.sp.flowcontrol;

public class WhileDemo2 {

	public static void main(String[] args) {
		char ch='G';
		
		int a=1;
		while(a<5) {
		int b=0;
		while(b<=a) { 
			System.out.print(ch+"  ");
			b++;
		}
		    System.out.println();
		    a++;
		}
		char ch1='*';
		int c=1;
		while(c<6) {
			int d=0;
			while(d<c) {
				System.out.print(ch1+"  ");
				d++;
				}
			System.out.println();
			c++;
			
	
		}
		
		

	}

}
