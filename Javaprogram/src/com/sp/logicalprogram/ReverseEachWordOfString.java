package com.sp.logicalprogram;

import java.util.HashMap;
import java.util.Map;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "I am boy I am doing my work";
		String[] str1 = str.split(" ");
		String reverse = "";
		for (String st : str1) {
			String temp = "";
			for (char ch : st.toCharArray()) {

				temp = ch + temp;
			}
			reverse = reverse + temp + " ";

		}
		System.out.print("Reverse of " + str + " is -> " + reverse);
		System.out.println();

		/*
		 * 
		 * String sList[]=str.split(" ");
		 * 
		 * String revString=""; for(String s:sList) { String tmp=""; for(char ch:
		 * s.toCharArray()) { tmp=ch+tmp; }
		 * 
		 * revString=revString+tmp+" "; } System.out.println(revString);
		 */
		
		String str3="i am doing my work";
		String[] str4=str3.split(" ");
		String rev=" ";
		for(String st2:str4) {
			String temp1=" ";
			for(char ch1:st2.toCharArray()) {
				
				temp1=ch1+temp1;
				
			}
			rev=rev+temp1+" ";
		}
		
		System.out.println("revrse of "+str3 +" is -> "+rev);
		
		String str5="Hello every one";
		String[] str6=str5.split(" ");
		String rev3=" ";
		for(int i=str6.length;i>=0;i--) {
			rev3=str6+rev3;
		}
		
		System.out.println(rev);
		
	}

}
