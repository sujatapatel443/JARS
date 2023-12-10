package com.sp.utilpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet();
		HashSet set1=new HashSet();
		set.add("Sujata");
		set.add("Anusha");
		set.add("Raj");
		set.add("Rekha");
		set.add("Pooja");
		set.add(new String("Sujat"));
		System.out.println(set);
		
		
		

	}

}
