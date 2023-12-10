package com.sp.java.builtin;

public class String10 {

	public static void main(String[] args) {
		Student st=new Student();
		String st1=String.valueOf(st);
		System.out.println(st1);
		Employee emp=new Employee();
		String st2=String.valueOf(emp);
		System.out.println(st2);
		emp.eid=2233;
		System.out.println(String.valueOf(emp));
	}
}
class Student{}
class Employee{
	int eid;
	public String toString() {
		return "Eid :"+eid;
	}
}
