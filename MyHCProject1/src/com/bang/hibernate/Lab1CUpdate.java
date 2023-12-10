package com.bang.hibernate;

import org.hibernate.*;
import org.hibernate.Transaction;

public class Lab1CUpdate {

	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			
			
			SessionFactory sessionFactory=HibernateUtil.getsessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			Student st=(Student)session.load(Student.class, 11);
			st.setName("Sujata Patel");
			st.setCourse("B.Tech");
			st.setAddress("Banglore");
			st.setCollege("SGR");
			session.update(st);
			
			
			Student st1=(Student)session.load(Student.class, 11);
			System.out.println(st1.getId()+" "+st1.getName()+" "+st1.getCourse()+" "+st1.getAddress()+" "+st1.getCollege());
			System.out.println("object updated----");
			
			tx.commit();
			session.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}

	}

}
