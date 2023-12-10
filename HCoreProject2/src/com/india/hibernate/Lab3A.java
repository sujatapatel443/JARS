package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab3A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Student st=(Student)session.load(Student.class, 101);
			System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getCourse()+"\t"+st.getPhone()+"\t"+st.getEmail());
			session.delete(st);
			System.out.println("Object deleted ...");
			
			tx.commit();
			session.close();
		
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
