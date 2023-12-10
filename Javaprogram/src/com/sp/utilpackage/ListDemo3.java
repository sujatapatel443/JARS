package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo3 {

	private static Object Object;

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Patel");
		list.add("Anusha");
		System.out.println(list);
		Iterator it=list.iterator();
		System.out.println(list.size());
		//System.out.println(list.remove("Anusha"));
		System.out.println(list);
		//System.out.println(it.next());
		//for(int i=1;i<size;i++)
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		System.out.println("main completed");


	}

	private static boolean hasNext() {
		return false;
	}

}
