package com.sp.flowcontrol;

public class Table2 {
	public static void main(String[] args) {
		int table=1;
		int number=1;
		int temp=0;
		while(number<=10) {
			temp=table*number;
			System.out.println(temp);
			number++;
		}
	}

}
