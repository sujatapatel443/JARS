package com.sp.java.builtin;

public class StringClass4 {

	public static void main(String[] args) {
		String str1="JLCINDIA";
		String str2="JLC"+"INDIA";
		String str3="JLC";
		String str4="INDIA";
		String str7=str3+str4;
		final String str5="JLC";
		final String str6="INDIA";
		String str8=str5+str6;
		System.out.println(str1==str2);
		System.out.println(str1==str7);
		System.out.println(str1==str8);

	}

}
