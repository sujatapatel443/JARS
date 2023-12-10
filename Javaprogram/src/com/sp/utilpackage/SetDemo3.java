package com.sp.utilpackage;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("Sujata");
		set.add("Anusha");
		set.add("Raj");
		set.add("Rekha");
		set.add("Pooja");
		set.add("Sujata");
		System.out.println(set);
	}
}
class Student{
	int sid;
	Student(int sid){
		this.sid=sid;
	} 
	@Override
	public String toString() {
		return sid+"";
	}
	@Override
	public boolean equals(Object obj) {
	
			Student st=(Student)obj;
		return false;
	}
	

}
