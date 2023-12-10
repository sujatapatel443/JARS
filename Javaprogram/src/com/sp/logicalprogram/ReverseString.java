package com.sp.logicalprogram;

public class ReverseString {

	public static void main(String[] args) {
		String str=" I am doing my work";
		String[] str1=str.split(" ");
		String rev=" ";
		
		for(String st:str1) {
			String temp=" ";
			for(char ch:st.toCharArray()) {
				temp=ch+temp;
			}
			
			rev=rev+temp+" ";
		}
		
		System.out.println(rev);
		System.out.println();
		String str2="Hello people";
		int length=str2.length();
		String reverse=" ";
		
		for(int i=0;i<=length-1;i++) {
			reverse=str2.charAt(i)+reverse;
		}
		
		System.out.println(reverse);
		

	}

}
