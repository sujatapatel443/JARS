package com.sp.flowcontrol;

public class EvenOddNumber {
    //Write a programme to find out Even and Odd number
	public static void main(String[] args) {
		int num=50;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i+"  is Even Number ");
			}else {
				System.out.println(i+"  is Odd Number");
			}
		}
		}
	}			