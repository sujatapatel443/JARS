package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List list=new ArrayList();
	     
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("JLC");
		System.out.println(list);
		list.add(2,"Java" );
		System.out.println(list);
		list.remove("Java");
		System.out.println(list);
		list.set(1,"sujata ");
		System.out.println(list);
		Object obj=list.get(3);
		System.out.println(obj);
		int x=list.indexOf(obj);
		System.out.println(x);
		int x1=list.indexOf("Dande");
		System.out.println(x1);
		int y=list.lastIndexOf("sujata");
		System.out.println(y);
		list.add(1, "Nivas");
		System.out.println(list);
		int a=list.lastIndexOf("Nivas");
		System.out.println(a);
		list.add(2,"Sujata");
		int b=list.lastIndexOf("JLC");
		System.out.println(b);
		System.out.println(list);
		List list1=list.subList(2, 6);
		System.out.println(list1);
		
		

	}

}
