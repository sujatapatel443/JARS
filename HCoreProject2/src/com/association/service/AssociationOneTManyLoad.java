package com.association.service;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.enitity.MYCustomer;
import com.association.enitity.Request;
import com.india.hibernate.HibernateUtil;


public class AssociationOneTManyLoad {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory f=HibernateUtil.getSessionFactory();
			Session s=f.openSession();
			tx=s.beginTransaction();
			MYCustomer c=(MYCustomer)s.load(MYCustomer.class, 101);
			System.out.println(c.getCid()+"\t"+c.getFname());
			
			Collection<Request> reqs=c.getRequests();
			reqs.forEach(r->{
				System.out.println(r.getReqId()+"\t"+r.getReqDate());
			});
			
			System.out.println("Bi directional .......");
			Request req1=(Request)s.load(Request.class, 1);
			System.out.println(req1.getReqId()+"\t"+req1.getCustomer().getCid());
			
			Request req2=(Request)s.load(Request.class, 2);
			System.out.println(req2.getReqId()+"\t"+req2.getCustomer().getCid());
			
			
			tx.commit();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
