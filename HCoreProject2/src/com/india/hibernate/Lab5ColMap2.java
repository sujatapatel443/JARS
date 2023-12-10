package com.india.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab5ColMap2 {
	
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			RStudent rStudent = (RStudent)session.load(RStudent.class, 101);
			
			System.out.println(rStudent.getSid()+"\t"+rStudent.getSname()+"\t"+rStudent.getQualification()+"\t"+rStudent.getDob()
			+"\t"+rStudent.getCourses()+"\t"+rStudent.getEmails()+"\t"+rStudent.getPhones()+"\t"+rStudent.getMarks()+"\t"+rStudent.getRefs());
			
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}

}
