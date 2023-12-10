package com.sp.java.builtin;

public class StringClass3 {

	public static void main(String[] args) {
		String str1="JLC";
		String str2="SUJATA";
		String str3=str1+str2;
		String str4=str1+"SUJATA";
		String str5="JLC"+str2;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("***********");
		System.out.println(str1+"\t"+str3+"\t"+str4+"\t"+str5);
		System.out.println(str3==str4);
		System.out.println(str3==str5);
		System.out.println(str4==str5);
		
		

	}

}
