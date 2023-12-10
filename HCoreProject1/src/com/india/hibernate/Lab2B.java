package com.india.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab2B {
	public static void main(String[] args){
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			Customer cust=(Customer)session.load(Customer.class, 601);
			
			System.out.println(cust);
			
			System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getBal()+"\t"+cust.getCity()+"\t"+cust.getEmail()+"\t"+cust.getPhone());
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
