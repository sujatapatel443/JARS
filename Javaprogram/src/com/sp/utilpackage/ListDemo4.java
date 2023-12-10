package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Patel");
		list.add("Anusha");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		

	}

}
