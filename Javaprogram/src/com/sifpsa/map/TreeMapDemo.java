package com.sifpsa.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		StudentDemo s1=new StudentDemo(101,"Neha",6);
		StudentDemo s2=new StudentDemo(105,"Seha",4);
		StudentDemo s3=new StudentDemo(102,"Rina",8);
		StudentDemo s4=new StudentDemo(106,"sona",9);
		StudentDemo s5=new StudentDemo(104,"Tina",2);
		TreeMap<StudentDemo,String> tm=new TreeMap<StudentDemo,String>(new MyComparator6());
		tm.put(s1, "College-DPS");
		tm.put(s2, "College-DPS");
		tm.put(s3, "College-DPS");
		tm.put(s4, "College-DPS");
		tm.put(s5, "College-DPS");
	//	System.out.println(tm);
		tm.forEach((k,v)->{System.out.println(k+" "+v+" ");});
	}

}
class MyComparator6 implements Comparator{

public int compare(Object obj1, Object obj2)	
{
	
	StudentDemo s11=(StudentDemo)obj1;
	StudentDemo s12=(StudentDemo)obj2;
	//String sname=obj1.
	//System.out.println(s11);
	return s11.name.compareTo(s12.name);
	//return obj1.city.equals(obj2.city)
	
	
	
}

}