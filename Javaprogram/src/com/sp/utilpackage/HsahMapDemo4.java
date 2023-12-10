package com.sp.utilpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HsahMapDemo4 {

	public static void main(String[] args) {
		HashMap<Student6, String> hm=new HashMap<Student6, String>();
		Student6 s1=new Student6(101,"Sujata","sujata@gmail.com");
		Student6 s2=new Student6(104,"Tanisha","tanishaa@gmail.com");
		Student6 s3=new Student6(103,"Ram","ram@gmail.com");
		Student6 s4=new Student6(105,"Deepak","deepak@gmail.com");
		Student6 s5=new Student6(107,"Shweta","sweta@gmail.com");
		Student6 s6=new Student6(106,"Vijay","vijay@gmail.com");
		Student6 s7=new Student6(102,"Anusha","anusha@gmail.com");
		Student6 s8=new Student6(101,"Sujata","sujata@gmail.com");
		Student6 s9=new Student6(102,"Devansh","dev@gmail.com");
		hm.put(s1, "Banglore");
		hm.put(s2,"Banglore");
		hm.put(s3,"Banglore");
		hm.put(s4, "Varanasi");
		hm.put(s5,"Allahabad");
		hm.put(s6, "Banglore");
		hm.put(s7, "Banglore");hm.put(s8, "Banglore"); hm.put(s9, "Banglore"); 
		System.out.println(hm);
		System.out.println("----Iterating HashMap by using iterator---");
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry mapentry=(Map.Entry)itr.next();
			System.out.println(mapentry.getKey()+" "+mapentry.getValue());
		}
		 System.out.println("----Iterating HashMap by Advanced FOR EACH METHOD-----");
		 hm.forEach((Key,Value)->{ System.out.println(Key+" "+Value); });
		 System.out.println("----Iterating HashMap by using ENHANCE FOR LOOP----");
		
		 for(Map.Entry<Student6, String> mapentry: hm.entrySet()) {
			  System.out.println(mapentry.getKey()+" "+mapentry.getValue());
			  }
		 System.out.println("----Iterating HashMap by using ENHANCE FOR LOOP----");
		 Map<String, String> m=new HashMap<String, String>();
		 m.put("id", "S101");
		 for(Map.Entry<String, String> mapentry : m.entrySet()) {
			 System.out.println(mapentry.getKey()+" "+mapentry.getValue());
		 }
	

	}

}
class Student6 implements Comparable{
	private int sid;
	private String name;
	private String email;
	Student6(int sid,String name,String email){
		this.sid=sid;
		this.name=name;
		this.email=email;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public int getSid() {
		return sid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	
	  @Override public String toString() { return sid+" "+name+" "+email; }
	 
	
	  @Override public int hashCode() { return sid; }
	
	  @Override public boolean equals(Object obj) { 
		  Student6 st=(Student6)obj;
	  return this.sid==st.sid && this.name.equals(st.name); 
	  
	  }
	 
	
	  @Override public int compareTo(Object o) { 
		  System.out.println("compareTo");
		  Student6 stu=(Student6)o; return
	  this.sid-stu.sid; }
	 
}