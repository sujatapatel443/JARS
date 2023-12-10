package com.sp.utilpackage;

import java.util.HashSet;

public class SetDemo4 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(new Student1 (11));
		set.add(new Student1(22));
		set.add(new Student1(33));
		set.add(new Student1(44));
		set.add(11);
		set.add(11);
		set.add(22);
		set.add(55);
		set.add(new Student1(11));
		set.add(new Student(44));
		System.out.println(set);
	}
}
class Student1{
	int sid;
	Student1(int sid){
		this.sid=sid;
	}
	@Override
	public String toString() {
		System.out.println("toString ()method");
		return sid+"";
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals () method");
		if(obj instanceof Student) {
			Student1 st=(Student1)obj;
			return this.sid==st.sid;
		}
		return true;
	}
	@Override
	public int hashCode() { 
		System.out.println("hash code () method");
		return sid;
	}

}
