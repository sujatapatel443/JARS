package com.association.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.enitity.TCustomer;
import com.india.hibernate.HibernateUtil;


public class AssociationManyTMany3 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory f=HibernateUtil.getSessionFactory();
			Session s=f.openSession();
			tx=s.beginTransaction();
			TCustomer cust1=(TCustomer)s.load(TCustomer.class, 113);
			
			cust1.setFname("RAJ");
			
			s.update(cust1);
			
			tx.commit();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
