package com.sp.utilpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {
		TreeMap tmap=new TreeMap();

		Stud s1=new Stud(11,"Shivani",9936323375l);
		Stud s2=new Stud(15,"Anusha",8936323375l);
		Stud s3=new Stud(16,"Shivani",9536323375l);
		Stud s4=new Stud(12,"Shivani",9636323375l);
		Stud s5=new Stud(13,"Shivani",9956323375l);
		Stud s6=new Stud(17,"Shivani",9356323375l);
		
		tmap.put(s1, "UPC");
		tmap.put(s2, "UPC");
		tmap.put(s3, "UPC");
		tmap.put(s4, "UPC");
		tmap.put(s5, "UPC");
		tmap.put(s6, "UPC");
		System.out.println(tmap);
		Set set=tmap.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry mapentry=(Map.Entry)it.next();
			System.out.println(mapentry);
		}
		System.out.println("---- ITERATION BY LAMBDA EXPRESSION------");
		tmap.forEach((k,v)->{
			System.out.println(k+" \t"+v);
		});

	}

}
class Stud implements Comparable{
	int sid;
	String name;
	long phone;
	Stud(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
	}
	@Override
	public int compareTo(Object o) {
		Stud s=(Stud)o;
		
		return this.sid-s.sid;
	}
	@Override
	public String toString() {
		return sid+" "+name;
	}
	
}
