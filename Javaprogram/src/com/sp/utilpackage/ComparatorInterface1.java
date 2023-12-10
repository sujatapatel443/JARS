package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorInterface1 {

	public static void main(String[] args) {
		System.out.println("----Iteration by NameComparator-----");
		TreeSet t=new TreeSet(new  NameComparator());
		t.add(new Student4(101,"Ravi"));
		t.add(new Student4(102,"Shyam"));
		t.add(new Student4(103,"Priya"));
		t.add(new Student4(104,"Sneha"));
		Iterator it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
class Student4 {
	int sid;
	String name;
	Student4(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
}
class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student4 && o2 instanceof Student4) {
			Student4 s1=(Student4)o1;
			Student4 s2=(Student4)o2;
			return s1.name.compareTo(s2.name);
		}
		return 0;
	}
	
}
