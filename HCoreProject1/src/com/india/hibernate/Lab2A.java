package com.india.hibernate;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lab2A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			AnnotationConfiguration	cfg=new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure();
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			Customer cust=new Customer(901,"Raj","raj@gmail.com","12345","Blore", 25000);
			session.save(cust); // insert record in table
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
