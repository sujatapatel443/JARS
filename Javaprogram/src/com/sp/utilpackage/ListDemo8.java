package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo8 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("sujata");
		list.add("Patel");
		list.add("Seema");
		list.add("Anusha");
		list.add("PATEL");
		ListIterator lit=list.listIterator(1);
		do {
			int index=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(index+"\t"+obj);
		}while(lit.hasNext());
		System.out.println();
		lit=list.listIterator(5);
		do {int index=lit.previousIndex();
		Object obj=lit.previous();
		//System.out.println(obj);
		System.out.println(index+"\t"+obj);
			
		}while(lit.hasPrevious());
		

	}

}
