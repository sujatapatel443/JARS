package com.sp.logicalprogram;

import java.util.ArrayList;
import java.util.List;

public final class StudentImmutable {
	private final int id;
	private final String name;
	private final List<String> emails;
	
	public StudentImmutable(int id, String name,List<String> testEmails) {
		//super();
		this.id = id;
		this.name = name;
		List<String> tempList=new ArrayList<String>();
		tempList.addAll(testEmails);
		this.emails=tempList;
		
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getEmails() {
		return emails;
	}

		
}
