package com.sp.logicalprogram;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutable {

	private final int id;
	private final String name;
	private final long phone;
	private final List<String> emails;

	MyImmutable(int id, String name, long phone, List<String> testEmails) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		List<String> tempList = new ArrayList();
		tempList.addAll(testEmails);
		this.emails = tempList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public List<String> getEmails() {
		return emails;
	}

}
