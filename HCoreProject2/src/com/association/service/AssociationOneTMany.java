package com.association.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.enitity.MYCustomer;
import com.association.enitity.Request;
import com.india.hibernate.HibernateUtil;


public class AssociationOneTMany {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory f=HibernateUtil.getSessionFactory();
			Session s=f.openSession();
			tx=s.beginTransaction();
			MYCustomer cust=new MYCustomer(105, "ARS", "PAR");
			s.save(cust);
			
			Request req1=new Request(7, "09-092022", "Tshirt");
			s.save(req1);
			Request req2=new Request(8, "09-092022", "Jeans");
			s.save(req2);
			req1.setCustomer(cust);
			req2.setCustomer(cust);
			
			tx.commit();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
