package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab16 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("RAJ");l.add("SUJATA");l.add("ANUSHA");l.add("SEEMA");
		
		Collections.sort(l,new MyCom());
		System.out.println(l);
	}

}
class MyCom implements Comparator<String>{

	
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}
