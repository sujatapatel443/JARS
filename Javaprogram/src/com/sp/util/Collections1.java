package com.sp.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Ravi");
		list.add("anu");
		list.add("su");
		list.add("shyam");
		
		System.out.println("List before sorting : "+list);
		Collections.sort(list);
		System.out.println("List after sortig : "+list);
		System.out.println(list);
		
		System.out.println("---custom sorting-----");
		ArrayList<String> al=new ArrayList<String>();
		al.addAll(list);
		
		Collections.sort(al,new MyComparator());
		
		
		System.out.println(al);
		
		System.out.println("----sorting by annonymous class----");
		Collections.sort(al,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(al);
		
		al.forEach((s)->{
			System.out.println(s);
		});
		
		ArrayList<Teacher> arraylist=new ArrayList<Teacher>();
		arraylist.add(new Teacher(1,"Radha",9125682434l));
		arraylist.add(new Teacher(2,"Dilip",9125382434l));
		arraylist.add(new Teacher(3,"Sujata",9125762434l));
		arraylist.add(new Teacher(4,"Ranveer",9124562434l));
		arraylist.add(new Teacher(5,"Jyoti",9978682434l));
		Collections.sort(arraylist,new MyTeacherBYName());
		System.out.println("--custom sorting by name---");
		System.out.println(arraylist);
		
		
		

	}



	}



/**
 * @MyComparator - this comparator is stand for sort the string in Decending order
 *
 */
class MyComparator implements Comparator{

	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
	
}
class Teacher {
	int tid;
	String name;
	long phone;
	Teacher(int tid,String name,long phone){
		this.tid=tid;
		this.name=name;
		this.phone=phone;
	}
	@Override
	public String toString() {
		return tid+" "+ name+" " +phone;
	}
}
class MyTeacherBYName implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Teacher && o2 instanceof Teacher) {
			Teacher t1=(Teacher)o1;
			Teacher t2=(Teacher)o2;
			return t1.name.compareTo(t2.name);
		}
		return 0;
	}
	
}