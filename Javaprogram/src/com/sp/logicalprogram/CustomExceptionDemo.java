package com.sp.logicalprogram;

import java.util.HashMap;
import java.util.Map;

public class CustomExceptionDemo {
	static int a=1;
	public static void main(String[] args) {
		a=15;
		if(a<=10) {
			throw new CustomException("You can not assign less than equals to 10");
		}
		else {
			System.out.println("number is assigned to a :"+a);
		}
		String str="SujataPatel";
		int length=str.length();
		String reverse="";
		int count=0;
		for(int i=length-1;i>0;i--) {
			reverse=reverse+str.charAt(i);
			count++;
		}
		System.out.println("Reverse of "+str+" is ->"+reverse);
		
		String s="sunitaaaaaramesh";
		char ch='a';
		int count1=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
			count1++;	
			}
		}
		System.out.println("Occurence of char  a in s is ->"+count1);
		
		String str1="hello ram ramesh hai ravi hai raju hai pihu hai k hai h";
		String word="hai";
		String[] st=str1.split(" ");
		int count2=0;
		for(int i=0;i<st.length-1;i++) {
			if(word.equals(st[i])) {
				count2++;
			}
		}
		System.out.println("Occurence of hai in "+str1+" is ->"+count2);
		
		String str2="hello ram ramesh hai ravi hai raju hai pihu hai k hai h";
		String occ="";
		String[] strr=str2.split(" ");
		int count3=0;
		Map<String ,Integer> map= new HashMap<String ,Integer>();
		for(String ss:strr) {
			if(occ.equals(ss)){
				count3++;
			}
			if(map.containsKey(ss)) {
				Integer i=map.get(ss);
					i=i+1;
					map.put(ss, i);
			}else {
				map.put(ss, 1);
			}
		}
		System.out.println(map);
		
		
		class MySingleton{
			private  MySingleton instance;
			private MySingleton() {
				
			}
			public MySingleton getMySingleton() {
				if(instance==null) {
					synchronized (MySingleton.class) {
						return new MySingleton();
					}
				}
				return instance;
			}
			
		}
		

	}

}
