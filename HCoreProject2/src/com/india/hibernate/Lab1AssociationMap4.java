package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.entity.Address;
import com.india.hibernate.entity.Address2;
import com.india.hibernate.entity.Customer;
import com.india.hibernate.entity.Customer2;

public class Lab1AssociationMap4 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Customer2 c=(Customer2)session.load(Customer2.class, 803);
			
			System.out.println(c.getCid()+"\t"+c.getFname()+"\t"+c.getLname()+"\t"+c.getEmail()+"\t"+c.getPhone()
			+"\t"+c.getAddress().getCity()+"\t"+c.getAddress().getAid()+"\t"+c.getAddress().getState());
			
			Address2 a=(Address2)session.load(Address2.class, 833);
			System.out.println(a.getAid()+"\t"+a.getCity()+"\t"+a.getState());
			
			Customer2 cc=a.getCst();
			System.out.println(cc);
			System.out.println(cc.getCid()+"\t"+cc.getFname()+"\t"+cc.getLname());
			
			c.setEmail("fggrsds@gmail.com");
			c.setFname("jggjgj");
			session.update(c);
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}

}
