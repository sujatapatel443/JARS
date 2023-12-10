package com.sp.utilpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Employee3 {
	public static void main(String []args) {
		Map map=new HashMap();
		Employee4 e1=new Employee4("raman",10,"Varanasi",243567667l);
		Employee4 e2=new Employee4("Anshi",11,"Sonebhadra",9125681423l);
		Employee4 e3=new Employee4("Shivani",12,"Robertsganj",34656264678l);
		Map map2=new HashMap();
		map.put(e1,"MGKVP");
		map.put(e2,"MGKVP");
		map.put(e3, "MGKVP");
		System.out.println(map);
		System.out.println("----BY TREEMAP------");
		Map map1=new TreeMap();
		Employee4 e4=new Employee4("raman",15,"Varanasi",243567667l);
		Employee4 e5=new Employee4("Anshi",11,"Sonebhadra",9125681423l);
		Employee4 e6=new Employee4("Shivani",8,"Robertsganj",34656264678l);
		map1.put(e4,"MGKVP");
		map1.put(e5,"MGKVP");
		map1.put(e6, "MGKVP");
		System.out.println(map1);	
		
	}

}

class Employee4 implements Comparable {
	private String ename;
	private int eid;
	private String address;
	private long phone;
	public Employee4(String ename, int eid, String address, long phone) {
		this.ename = ename;
		this.eid = eid;
		this.address = address;
		this.phone = phone;
	}
	public Employee4() {
	}
	public void setEname(String name) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getPhone() {
		return phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String address() {
		return address;
	}

	@Override
	public String toString() {
		return eid + "\t"+ename+"\t"+phone+"\t"+address;
	}

	@Override
	public int hashCode() {
		return eid;

	}

	@Override
	public boolean equals(Object obj) {
			Employee4 em = (Employee4) obj;
			return this.eid==em.eid;
	}
	@Override
    public int compareTo( Object obj) {
		if(obj instanceof Employee4) {
			Employee4 em=(Employee4)obj;
			return this.eid-em.eid;
		}
		return 0;	
	}
	
	

}
