package com.bang.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class Lab1A {
	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
			
			AnnotationConfiguration cfg=new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure();
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			Student st=new Student(17,"Anu","Varanasi","BCA","UP College");
			session.save(st);
			
			
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
