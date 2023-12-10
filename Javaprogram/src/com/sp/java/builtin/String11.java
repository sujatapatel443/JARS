package com.sp.java.builtin;

public class String11 {

	public static void main(String[] args) {
		String str="jlcIndia";
		int len=str.length();
		System.out.println(str+"\t"+len);
		String str2=str.toLowerCase();
		System.out.println(str2);
	//	String str3=String.toUpperCase();
		String str3="INDIA";
		String str4=str3.trim();
		System.out.println(str4);
		System.out.println(str3==str4);
		String str5="    SEEMA";
		String str6=str5.trim();
		System.out.println(str5);
		System.out.println(str5+"\t"+str6);
		System.out.println(str5==str6);
		System.out.println(str3+"\t"+str3.length());
		System.out.println(str5+"\t"+str6.length());
		String str7="";
		System.out.println(str7.length());
		System.out.println(str7.isEmpty());
		

	}

}
