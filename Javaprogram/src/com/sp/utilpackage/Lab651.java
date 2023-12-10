package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lab651 {

	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		emails.add("sujata.patel443@gmail.com");
		emails.add("seema.patel223@gmail.com");
		emails.add("rajk443@gmail.com");
		ArrayList<Long> phones=new ArrayList<Long>();
		phones.add(9936323375l);
		phones.add(9125681423l);
		phones.add(9452635878l);
		LinkedHashMap<String,Long> refs=new LinkedHashMap<String,Long>();
		refs.put("sri", 111111111l);
		refs.put("Nivas", 22222222l);
		refs.put("Patel", 333333333l);
		ArrayList list=new ArrayList();
  		list.add(new Student5(99,"Sujata",emails,phones,refs));
  		list.add(new Student5(95,"Su",emails,phones,refs));
  		list.add(new Student5(99,"Sujata",emails,phones,refs));
  		list.add(new Student5(100,"Sujata",emails,phones,refs));
		System.out.println(list);

	
	}

}
class Student5{
	int sid;
	String name;
	List<String>emails;
	List<Long>phone;
	Map<String,Long>refs;
	Student5
	(int sid,String name,List<String>emails,List<Long>phone,Map<String,Long>refs){
		this.sid=sid;
		this.name=name;
		this.emails=emails;
		this.phone=phone;
		this.refs=refs;
	} 
	public String toString() {
		return sid+"\t"+name+"\t"+emails+"\t"+phone+"\t"+refs;
	}
}
