package com.india.hibernate;


import org.hibernate.*;
import org.hibernate.cfg.*;

public class Lab2AA {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			Customer cust=new Customer(555,"Raj","raj@gmail.com","12345","Blore", 25000);
			session.save(cust); // insert record in table
			
			TestDto testDto=new TestDto(455, "PATEL");
			session.save(testDto);
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
