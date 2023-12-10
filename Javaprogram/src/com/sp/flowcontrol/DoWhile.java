package com.sp.flowcontrol;

public class DoWhile {

	public static void main(String[] args) {
		char ch='A';
		int i=1;
		do{
			int j=0;
			do{
				System.out.print(ch+"  ");
				j++;
			}
			while(j<=i);
			System.out.println();
			i++;
			
		}while(i<5);
	}

}
