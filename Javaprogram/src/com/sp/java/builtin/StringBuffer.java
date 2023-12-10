package com.sp.java.builtin;

public class StringBuffer {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("JLC");
		StringBuilder sb1=new StringBuilder("JLC");
		System.out.println(sb1.equals(sb1));
		String str2=sb.toString();
		String str3=sb1.toString();
		System.out.println("C: "+sb.capacity());
		System.out.println("L: "+sb.capacity());
		sb.trimToSize();
		System.out.println("C: "+sb.capacity());
		System.out.println("L: "+sb.capacity());
		String str="JLC";
		System.out.println(str.contentEquals(sb));
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());		
		String exp ="[A-Za-z0-9]*";
		System.out.println("********************");
		System.out.println("jlc".matches(exp));
		System.out.println("6".matches(exp));
		String exp1="^[A-Z][A-Za-z0-9]*";
		System.out.println("jARETTJlc45666".matches(exp));
		System.out.println("jlc".matches(exp));
		StringBuilder sb2=new StringBuilder("JLC");
		System.out.println(sb2.capacity());
		System.out.println("C"+sb2.capacity());
		System.out.println("L:"+sb2.length());
		String str4="JLC";
		StringBuilder sb3=new StringBuilder("JLC");
		System.out.println(str4.contentEquals(sb3));
		String str5="A";
		StringBuilder sb4=new StringBuilder("A"); 
		StringBuilder sb5=new StringBuilder("A");
		System.out.println(sb4.equals(sb5));
		System.out.println(sb5.toString());
		//String str7=sb4.toLowerCase();
		String str8=sb5.toString();
		System.out.println(str8);
		System.out.println(str);
		System.out.println(str5.hashCode());
		System.out.println(sb4.hashCode());
		
		
		
		
	}

}
