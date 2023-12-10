package com.jdbc.database;

public class LabTest {
	public static void main(String[] args) {
		String sql="select * from empl where ename='KAL'";
		System.out.println(sql);
		String name="RAJ";
		
		String testSql="select * from empl where ename='"+name+"'";
		System.out.println(testSql);
	}

}
