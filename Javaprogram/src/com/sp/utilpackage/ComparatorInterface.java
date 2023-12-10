package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorInterface {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new SidComparator());
		ts.add(new Student3(105,"Radha"));
		ts.add(new Student3(102,"Raju"));
		ts.add(new Student3(104,"Sujata"));
		ts.add(new Student3(101,"Raj"));
		System.out.println(ts);
		Iterator it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----Iteration by using NameComparator---");
		TreeSet set=new TreeSet(new NmaeComparator());
		set.addAll(ts);
		Iterator it1=set.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}

}
class Student3{
	int sid;
	String name;
	Student3
	(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}

class SidComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student3 && o2 instanceof Student3) {
			Student3 s1=(Student3)o1;
			Student3 s2=(Student3)o2;
			return s1.sid-s2.sid;
		}
		return 0;
	}
}
class NmaeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student3 && o2 instanceof Student3) {
			Student3 s1=(Student3)o1;
			Student3 s2=(Student3)o2;
			return s1.name.compareTo(s2.name);
		}
		return 0;
	}
}
