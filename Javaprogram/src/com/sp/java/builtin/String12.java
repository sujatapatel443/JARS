package com.sp.java.builtin;
public class String12 {
	public static void main(String[] args) {
	String str="JLC";
	String str1=str.trim();
	System.out.println(str+"\t"+str1);
	System.out.println(str==str1);
	String str2="  JLC  ";
	String str3=str2.trim();
	char[] ch= {'J','L','C','I','N','D','I','A'};
	byte[] b= {65,66,67,68,69,70,71,72};
	String str4=new String(ch,3,5);
	String str5=new String(b,3,4);
	System.out.println("str4 :"+str4);
	System.out.println("str5 :"+str5);
	System.out.println(str4==str5);
	System.out.println(str4.equals(str5)); 
	String str6="Hai, Welcome to java learning center";
	System.out.println(str6.split("java"));
	String []str7=str6.split("java");
	System.out.println("Len :"+str7.length);
	
			
		}
		
	
	
	}
	
	
	
	
	

	
	