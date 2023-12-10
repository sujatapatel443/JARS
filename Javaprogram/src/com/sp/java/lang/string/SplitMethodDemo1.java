package com.sp.java.lang.string;

public class SplitMethodDemo1 {

	public static void main(String[] args) {
		String str="chanchala  gave a chance to her he has to come otherwise he will loose his everything understood he he he he he he ";
		char ch='a';
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==ch) {
				count++;
				
			}
		}
		System.out.println("Count of  a is -> "+count);

	}

}
