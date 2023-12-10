package com.association.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.enitity.CControl;
import com.india.hibernate.HibernateUtil;

public class OtherMapHiber {

	public static void main(String[] args) {
		
		Transaction tx=null;
		
		try {
			SessionFactory f=HibernateUtil.getSessionFactory();
			Session s=f.openSession();
			tx=s.beginTransaction();
			
			CControl c=(CControl)s.load(CControl.class, 2);
			c.setName("MKS");
			s.update(c);
			
			tx.commit();
			s.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}

	}

}
