package com.sp.logicalprogram;

import java.util.HashMap;
import java.util.Map;

public class StringToReverseString {

	public static void main(String[] args) {

		String str = "SujataPatel";

		int length = str.length();

		String reverse = "";

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reverse of " + str + " is : " + reverse);
		char ch = 'A';
		String countStr = "Hi Raj , Hi Raj is having 3.5 yrs of exp. Raj is working in IBM.";
		String stArray[] = countStr.split(" ");
		int count = 0;
		//int wcount = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : stArray) {

			if ("Raj".equals(s)) {
				count++;
			}

			if (map.containsKey(s)) {
				Integer i = map.get(s);
				i = i + 1;
				map.put(s, i);
			} else {
				map.put(s, 1);
			}

		}
		System.out.println(map);
		System.out.println("Occurance of raj is:" + count);
		
		String str1="AnushaPatel";
		int a=str1.length();
		String reverse1="";
		for(int i=length-1;i>=0;i--) {
			reverse1=reverse1+str1.charAt(i);
		}
		System.out.println("Reverse of "+str1+" is :"+reverse1);
		
		String str2="RajPatel";
		int b=str2.length();
		String reverse2="";
		for(int i=b-1;i>=0;i--) {
			reverse2=reverse2+str2.charAt(i);
		}
		System.out.println("Reverse of "+str2+" is :"+reverse2);
		
		System.out.println(str1.hashCode());
		System.out.println(str1.toString()); 
		
		//WAP TO COUNT A WORD IN GIVEN STRING
		
		String st="hallo Anu hai mrs how are  you .when you came hai here hai friends ";
		/*
		 * String wordcount="hai"; String st2[]=st.split(" "); int count2 =0 ; for(int
		 * i=0;i<st2.length-1;i++) { if(wordcount.equals(st2[i])) { count2++; }
		 * 
		 * } System.out.println("The String Hai count is :"+count2);
		 */
		/*
		 * String[] s4=st.split(" ");
		 * 
		 * String word="hai"; int cou=0;
		 * 
		 * for(int i=0;i<s4.length-1;i++) { if(word.equals(s4)) { count++; } }
		 * System.out.println(count);
		 */
		
		String[] s4=st.split(" ");
		
		String s="";
		int co=0;
		
		for(int i=0;i<st.length()-1;i++) {
			if(s.equals(s4)) {
				count++;
			}
		}
		
		Map<String,Integer> map3=new HashMap<String,Integer>();
		
		if(map.containsKey(s)) {
			int i=map.get(s);
			i++;
			map.put(s, i);
		}else {
			map.put(s, 1);
		}
		
		System.out.println(map);
	}

	
}
