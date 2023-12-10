package com.sp.java.builtin;

public class StringClass {

	public static void main(String[] args) {
		String str1="JLC";
		String str2="JLC";
		String str3="ANUSHA";
		String str4="SUJATA";
		String str5=new String("JLC");
		String str6=new String("JLC");
		String str7=new String("SUJATA");
		String str8=new String("SUJATA");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str5);
		System.out.println(str4==str5);
		System.out.println(str7==str8);
		System.out.println(str1==str4);
		System.out.println(str5==str6);
		

	}

}
