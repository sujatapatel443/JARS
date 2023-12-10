package com.sp.utilpackage;
import java.util.*;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CustomSorting {

	public static void main(String[] args) {
		
		
		HashSet hs=new HashSet();
		Employee2 e1=new Employee2(105,"Raj",50000);
		Employee2 e2=new Employee2(103,"Sujata",30000);
		Employee2 e3=new Employee2(104,"Garima",30000);
		Employee2 e4=new Employee2(106,"Namrata",30000);
		Employee2 e5=new Employee2(102,"Amrita",30000);
		Employee2 e6=new Employee2(101,"Kajal",30000);
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		//System.out.println(hs);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet(hs);
		System.out.println(hs);
		System.out.println(lhs);
		System.out.println("***********************");
		TreeSet ts=new TreeSet(hs);
		System.out.println(ts);
		//System.out.println(lhset);
		TreeSet st1=new TreeSet(new MyComparatorByName());
		st1.addAll(ts);
		System.out.println(st1);
		

	}

}
class Employee2 implements Comparable{
	int eid;
	String name;
	int salary;
	Employee2(int eid,String name,int salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Employee2) {
			Employee2 i=(Employee2)o;
			return this.eid-i.eid;
		}
		return 0;
	}
	@Override
	public String toString() {
		return eid+" "+name+" "+ salary;
	}
	
	}
class MyComparatorByName implements Comparator{
	

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Employee2 && o2 instanceof Employee2) {
			Employee2 s1=(Employee2)o1;
			Employee2 s2=(Employee2)o2;
			return s1.name.compareTo(s2.name);
			
		}
		return 0;
	}
	
}