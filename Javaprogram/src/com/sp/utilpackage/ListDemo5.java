package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Patel");
		list.add("Anusha");
		ListIterator lit=list.listIterator();
		System.out.println(list);
		while(lit.hasNext()) {
			Object obj=lit.next();
			System.out.println(obj);
			if(obj.equals("raam")) {
				lit.remove();
				
			}else if(obj.equals("Patel")) {
				lit.set("core");
			}
		}System.out.println(list);
		

	}

}
