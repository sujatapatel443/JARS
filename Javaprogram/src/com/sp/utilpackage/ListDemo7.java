package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo7 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("sujata");
		list.add("Patel");
		list.add("Seema");
		list.add("Anusha");
		list.add("PATEL");
		ListIterator lit=list.listIterator();
		System.out.println(list);
		System.out.println("Forward order");
		while(lit.hasNext()) {
			int index=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(obj+"\t"+index);
		}
		System.out.println("Previous order");
		while(lit.hasPrevious()) {
			int index=lit.previousIndex();
			Object obj=lit.previous();
			System.out.println(obj+"\t"+index);
		}

		
	}

}
