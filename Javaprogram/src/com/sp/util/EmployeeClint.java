package com.sp.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeClint {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(103,"Sujata",20000));
		al.add(new Employee(105,"Vijay",5000));
		al.add(new Employee(102,"Sunita",10000));
		al.add(new Employee(101,"Suhel",40000));
		al.add(new Employee(108,"Ram",70000));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Object o=(Object)it.next();
			System.out.println(o);
		}
		
		
	}
}
