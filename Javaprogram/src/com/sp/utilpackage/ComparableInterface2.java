package com.sp.utilpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableInterface2 {

	public static void main(String[] args) {
		System.out.println("  Employee info  ");
		TreeSet tset=new TreeSet();
		tset.add(new Employee4(11,"sujata"));
		tset.add(new Employee4(12,"Rekha"));
		tset.add(new Employee4(13,"Krishna"));
		tset.add(new Employee4(14,"Meghana"));
		Iterator it=tset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
class Employee implements Comparable{
	int eid;
	String name;
	Employee(int eid, String name){
		this.eid=eid;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Employee4) {
			Employee4 en=(Employee4)o;
			return this.name.compareTo(en.name);
		}
		return 0;
	}
	@Override
	public String toString() {
		return eid+"\t"+name;
	}
	
}
