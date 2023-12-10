package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilityMethodsDemo3 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(new StringBuilder("SriNivas"));
		list.add(new StringBuilder("Dande"));
		list.add(new StringBuilder("Sujata"));
		list.add(new StringBuilder("Raj"));
		list.add(new StringBuilder("Anusha"));
		list.add(new StringBuilder("Ritu"));
		System.out.println(list);
		Collections.sort(list,new StringBuilderComp());
		System.out.println(list);
	}

}
class StringBuilderComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			String s1=(String)o1;
			String s2=(String)o2;
			return s2.compareTo(s1);
		}
		return 0;
	}
	
}
