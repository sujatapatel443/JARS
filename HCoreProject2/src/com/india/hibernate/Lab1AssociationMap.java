package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.entity.Address;
import com.india.hibernate.entity.Customer;

public class Lab1AssociationMap {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer(123,"Raj","Patel","raj@gmail.com","123456789");
			session.save(cust);
			
			Address add=new Address(124,"HMT MAIN","Blore","KARNATAKA");
			session.save(add);
			
			cust.setAddress(add);
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}

}
