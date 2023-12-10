package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.entity.Address2;
import com.india.hibernate.entity.Customer2;

public class Lab1AssociationMap3 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			Customer2 cust=new Customer2(913,"Raj","Patel","raj@gmail.com","123456789");
			session.save(cust);
			
			Address2 add=new Address2(913,"HMT MAIN","Blore","KARNATAKA");
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
