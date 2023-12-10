package com.sp.utilpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableInterface {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add("Sujata");
		ts.add("Raj");
		ts.add("Anusha");
		ts.add("Seema");
		System.out.println(ts);
		System.out.println("****************");
		TreeSet set=new TreeSet();
		System.out.println("   STUDENT INFO   ");
		set.add(new Student2 (106,"Sujata"));
		set.add(new Student2(103,"Raj"));
		set.add(new Student2(105,"Anusha"));
		set.add(new Student2(104,"JSP"));
		set.add(new Student2(102,"Raj"));
		
		System.out.println(set);
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		

	}

}
class Student2 implements Comparable{
	int sid;
	String name;
	Student2(int sid,String name){
		this.sid=sid;
		this.name=name;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student st=(Student)o;
			return st.sid-this.sid;
			
		}
		return 0;
	}
	@Override
	public String toString() {
		return sid+"\t"+name;
	}
	
}
