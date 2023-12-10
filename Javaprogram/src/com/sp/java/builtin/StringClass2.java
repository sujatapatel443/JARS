package com.sp.java.builtin;

import java.util.Scanner;

public class StringClass2 {

	public static void main(String[] args) {
		String str1="JLC";
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please Enter String");
		String str2=sc.nextLine();
		System.out.println(str2);
		System.out.println("Re Enter String");
		String str3=sc.nextLine();
		System.out.println(str3);
		String str4=str3.intern();
		String str5=str4.intern();
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		System.out.println(str4==str5);
		System.out.println(str3==str4);

	}

}
