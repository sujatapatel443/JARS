package com.india.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5ColMap1 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			List<String> emails=new ArrayList<String>(); emails.add("ra@gmail.com");emails.add("sa@gmail.com");
			List<Integer> marks=new ArrayList<Integer>();marks.add(98);marks.add(89);marks.add(98);
			Set<Long> phones=new LinkedHashSet<Long>(); phones.add(new Long(9123456780L));phones.add(new Long(1234567890L));
			Map<String, Long> refs=new HashMap<String, Long>();
			refs.put("aid", 101L);refs.put("account", 123456L);refs.put("ccc", 765438L);
			
			RStudent rStudent = new RStudent(302, "ANUSHA", "26-08-12", "Primay", new String[] {"JAVA","JDBC","Servlet","JSP"}, 
					emails, marks, phones, refs);
			
			session.save(rStudent);
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}

}
