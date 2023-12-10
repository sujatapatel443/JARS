package com.sp.utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab595 {

	public static void main(String[] args) {
		TreeSet<Emp> al = new TreeSet<Emp>();
		al.add(new Emp(11, "Sujata", 20000));
		al.add(new Emp(15, "Rita", 2000));
		al.add(new Emp(18, "Ram", 10000));
		al.add(new Emp(12, "Seema", 25000));
		al.add(new Emp(14, "Anusha", 30000));
		System.out.println(al);

		Iterator<Emp> it = al.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		al.forEach((l) -> {
			System.out.println(l);
		});
		TreeSet<Emp> st = new TreeSet<Emp>(new MyCompName());
		st.addAll(al);
		System.out.println(st);

		Iterator it1 = st.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		TreeSet<Emp> st2 = new TreeSet<Emp>(new MyComBySalary());
		st2.addAll(al);
		System.out.println(st2);

		Iterator it2 = st.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
}

class Emp implements Comparable {
	private int eid;
	private String name;
	private float salary;

	Emp(int eid, String name, float salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	/*
	 * Emp(){
	 * 
	 * }
	 */
	public void setId(int eid) {
		this.eid = eid;
	}

	public int getId() {
		return eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return eid + "\t" + name + "\t" + salary;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Emp) {
			Emp e = (Emp) o;
			return (int) (this.salary - e.salary);
		}
		return 0;
	}

}

class MyCompName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Emp && o2 instanceof Emp) {
			Emp str1 = (Emp) o1;
			Emp str2 = (Emp) o2;
			return str1.getName().compareTo(str2.getName());
		}
		return 0;
	}

}

class MyComBySalary implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Emp && o2 instanceof Emp) {
			Emp str3 = (Emp) o1;
			Emp str4 = (Emp) o2;
			return (int) (str3.getSalary() - str4.getSalary());
		}
		return 0;
	}

}