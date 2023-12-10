package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.entity.Address;
import com.india.hibernate.entity.Customer;

public class Lab1AssociationMap2 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Customer c=(Customer)session.load(Customer.class, 102);
			
			System.out.println(c.getCid()+"\t"+c.getFname()+"\t"+c.getLname()+"\t"+c.getEmail()+"\t"+c.getPhone()
			+"\t"+c.getAddress().getCity()+"\t"+c.getAddress().getAid()+"\t"+c.getAddress().getState());
			
			Address a=(Address)session.load(Address.class, 222);
			System.out.println(a.getAid()+"\t"+a.getCity()+"\t"+a.getState());
			
			
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}

}
