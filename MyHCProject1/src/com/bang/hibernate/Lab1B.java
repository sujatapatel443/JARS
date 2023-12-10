package com.bang.hibernate;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1B {

	public static void main(String[] args) {
		Transaction tx=null;
		try {
		SessionFactory sessionFactory=HibernateUtil.getsessionFactory();
		Session session=sessionFactory.openSession();
		tx=session.beginTransaction();
		
		Student st=new Student(13,"Raj","Varanasi","MCA","RKGIT");
		session.save(st);
		
		TestDto testDto=new TestDto(11,"Anusha",993375l);
		session.save(testDto);
		
		tx.commit();
		session.close();
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

	}

}
