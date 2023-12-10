package com.sp.java.builtin;

public class StringClass1 {

	public static void main(String[] args) {
		String str1=("JLC");
		String str2=new String("JLC");
		String str3=str2.intern();
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println();
		String str4="SUJATA".intern();
		String str5="SUJATA";
		System.out.println(str3==str4);
		System.out.println(str4==str5);

	}

}
