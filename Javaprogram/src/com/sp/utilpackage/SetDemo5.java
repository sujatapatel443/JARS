 package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {

	public static void main(String[] args) {
		Set set=new TreeSet();
		set.add("Sujata");
		set.add("Anusha");
		set.add("Raj");
		set.add("Seema");
		set.add("Rekha");
		System.out.println(set);
		Set st1=new TreeSet();
		Studentt s1=new Studentt(101,"Sujata");
		Studentt s2=new Studentt(102,"Raj");
		Studentt s3=new Studentt(103,"Anusha");
		Studentt s4=new Studentt(104,"Seema");
		Studentt s5=new Studentt(105,"Rekha");
		st1.add(s1);
		st1.add(s2);
		st1.add(s3);
		st1.add(s4);
		st1.add(s5);
		System.out.println(st1);
		Iterator it=st1.iterator();
		while(it.hasNext()) {
			Studentt obj=(Studentt)it.next();
			System.out.println(obj.sid+"\t"+obj.name);
		}
		Set set2=new TreeSet(new MyComparatorBySid());
		set2.addAll(st1);
		System.out.println(set2);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Set set3=new TreeSet(new  MyComparatorByname());
		set3.addAll(st1);
		System.out.println(set3);
	}
}

class Studentt implements Comparable {
	int sid;
	String name;

	Studentt(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("hash code method");
		return sid;
	}

	@Override
	public String toString() {
		System.out.println("toString method");
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method");
		Studentt s = (Studentt) obj;
		return this.sid == s.sid;
	}

	@Override
	public int compareTo(Object o) {
		System.out.println("compareTo");
		//return this.name.compareTo(((Studentt) o).name);
		return (((Studentt)o).name).compareTo(this.name);
	}
}

class c implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Studentt s1 = (Studentt) o1;
		Studentt s2 = (Studentt) o2;
		return s1.name.compareTo(s2.name);
	}
}

class MyComparatorBySid implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Studentt s1 = (Studentt) o1;
		Studentt s2 = (Studentt) o2;
		return s1.sid - s2.sid;
	}

}
class MyComparatorByname implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Studentt s1 = (Studentt) o1;
		Studentt s2 = (Studentt) o2;
		return s1.name.compareTo(s2.name);
	}

}

