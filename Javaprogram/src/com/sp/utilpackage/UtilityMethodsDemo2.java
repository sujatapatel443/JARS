package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilityMethodsDemo2 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Patel");
		list.add("Kumar");
		list.add("Singh");
		list.add("Hari");
		System.out.println("---SORTING IN ASSENDING ORDER-----");
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, new MyDescending());
		System.out.println(list);
	}
}
class MyDescending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			String str1=(String)o1;
			String str2=(String)o2;
			return str2.compareTo(str1);
		}
		return 0;
	}
	
}

