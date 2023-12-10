package com.sp.flowcontrol;

public class WhileDemo1 {

	public static void main(String[] args) {
		//System.out.println("hello");
		int num=3;
		int i=1;
		while(i<8) {
			int j=0;
			while(j<=i) {
				System.out.print(num+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	

	}

}
