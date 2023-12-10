package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Stream {
	
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("RAJ");l.add("SUJATA");l.add("SEEMA");l.add("ANUSHA");
		
		l.stream().forEach(a->System.out.println(a));
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		l.forEach(a->{
			String res=a+10;
			System.out.println(res);	
		});
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		l.forEach(System.out::println);
	}

}