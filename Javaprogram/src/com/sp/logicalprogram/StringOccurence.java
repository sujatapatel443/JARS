package com.sp.logicalprogram;

import java.util.HashMap;
import java.util.Map;

public class StringOccurence {

	public static void main(String[] args)  {
		String str="hai i am sujata hai all hope all are good hai every one hai hai hai hai ahi";
		String word="hai";
		String str1[]=str.split(" ");
		int count =0;
		for(int i=1;i<str1.length-1;i++) {
			if(word.equals(str1[i])) {
				count++;
				
			}
		}
		Map<String ,Integer> map=new HashMap<String ,Integer>();
		for(String st:str1) {
			if(word.equals(str1)) {
				count++;
			}
			if(map.containsKey(st)) {
				Integer i=map.get(st);
				i=i+1;
				map.put(st, i);
			}
			else {
				map.put(st, 1);
			}
		}
		System.out.println("Occurence of Each String in "+str+" is :"+map);

		System.out.println("Occurence of hai in given String ->"+str+" is -> "+count);
		String s="MrRajKumarPatel";
		int length=s.length();
		String reverse=" ";
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse of "+s+" is :"+reverse);
		
		//int a=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				/*if(j%2==0) {*/
					System.out.print(j*2+" ");
				//}
			}
			System.out.println();
		}
		int a=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(a++ +" ");	
			//a=a+2;
			}
			System.out.println();
		}
		
		
		
		
	}

}
