package com.sp.flowcontrol;

public class Alphabet {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(ch++ +"\t");
			}
			System.out.println();
		}

		
	}

}
