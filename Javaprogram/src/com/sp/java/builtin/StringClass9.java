package com.sp.java.builtin;

public class StringClass9 {

	public static void main(String[] args) {
		String str1=new String("JLC");
		String str2=new String("JLC");
		String str3=new String("jlc");
		System.out.println(str1+"\t"+str2+"\t"+str3);
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1);
		System.out.println(str2);
		//System.out.println();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println("*****************");
		System.out.println("acC".compareTo("acCC"));
		System.out.println("ABC".compareTo("ABCDEFGH"));
		System.out.println("ABC".compareToIgnoreCase("dac"));
		System.out.println("ABC".compareToIgnoreCase("abc"));
		System.out.println("ABCDEFGH".compareToIgnoreCase("ABC"));
		int ab=98;
		String strr=String.valueOf(ab);
		String strr1=String.valueOf(true);
		System.out.println(strr+"    "+strr1);
		System.out.println(String.valueOf('A'));
		
		
		
		
	}

}
