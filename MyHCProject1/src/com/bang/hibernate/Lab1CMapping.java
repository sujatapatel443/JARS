package com.bang.hibernate;

import java.util.*;

import org.hibernate.*;

public class Lab1CMapping {
	public static void main(String[] args) {
		Transaction tx = null;
		try {

			SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();

			List<String> email = new ArrayList<String>();
			email.add("su.patel12@gmail.com");
			email.add("raj33@gmail.com");
			email.add("aun43@gemail.com");
			List<Integer> marks = new ArrayList<Integer>();
			marks.add(93);
			marks.add(95);
			marks.add(85);
			Set<Long> phone = new LinkedHashSet<Long>();
			phone.add(new Long(9936323375l));
			phone.add(new Long(9453625878l));
			phone.add(new Long(342576787l));

			StudentEntityMapping st=new StudentEntityMapping(11,"Sujata", "16-05-89", "B.Sc", new String[]{"JSP","JDBC","Spring"}, email, marks, phone);

			session.save(st);
			tx.commit();
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}

	}

}
