package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab4A {
	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Student st=(Student)session.load(Student.class, 101);
			System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getCourse()+"\t"+st.getPhone()+"\t"+st.getEmail());
			st.setCourse("B.Tech");
			st.setEmail("aj@yahoo.com");
			st.setPhone(123456789L);
			
			session.update(st);
			
			Student st1=(Student)session.load(Student.class, 101);
			System.out.println(st1.getSid()+"\t"+st1.getName()+"\t"+st1.getCourse()+"\t"+st1.getPhone()+"\t"+st1.getEmail());
			System.out.println("Object updated ...");
			
			tx.commit();
			session.close();
		
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}
	

}
