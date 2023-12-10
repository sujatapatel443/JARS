package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jav8Lab16 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("RAJ");l.add("SUJATA");l.add("ANUSHA");l.add("SEEMA");
		
		Collections.sort(l,(a,b)->{
			//System.out.println("lamda..");
			return b.compareTo(a);
		});
		System.out.println(l);
		
		Comparator<String> comp=(a,b)->{
			return a.compareTo(b);
		};
		
		Collections.sort(l, comp);
		System.out.println(l);
	
	
	}
	

}
