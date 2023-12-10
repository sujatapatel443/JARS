package com.java8.straemapi;

import java.util.HashMap;
import java.util.Map;

public final  class ReverseString {
	public static void main(String[] args) {
		
	String str="hai i am doing my work";
	String word="";
	String[] str2=str.split(" ");
	int count=0;
	for(int i=1;i<=str2.length-1;i++){
		
		if(word.equals(str2)) {
			count++;
		}
	}
	Map<String,Integer> map=new HashMap<>();
	for(String st:str2) {
		if(map.containsKey(st)) {
			Integer i=map.get(st);
			i=i+1;
			map.put(st, i);
		}
		else {
			map.put(st, 1);
		}
	}
	System.out.println(map);
	
	Map<Character,Integer> map1=new HashMap<>();
	
	char[] ch=str.toCharArray();
	
	for(char c:ch) {
		if(map1.containsKey(c)) {
			Integer i=map1.get(c);
			i++;
			map1.put(c, i);
					
		}else {
			map1.put(c, 1);
		}
	}
	System.out.println(map1);
				
	}
	
	}
