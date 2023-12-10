
package com.sp.java.lang.string;
//WAP to check occurence of hello  word in given string
public class SplitMethodDemo {

	public static void main(String[] args) {
		String str="hello ram hello sri hope  hello is pleasent.Ram said hello to his mother ";
		String s="hello";
		String temp[]=str.split(" ");
		int count =0;
		for(int i=0;i<temp.length;i++) {
			if( s.equals(temp[i])){
				 count++;
			}
		}
		System.out.println("The String is : "+s);
		System.out.println(count);

	}

}
