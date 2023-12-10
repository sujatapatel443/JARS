package com.hibernate.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.HibernateUtil;
import com.india.hibernate.Student;

public class Lab1A {
	public static void main(String[] args) {
		
		Transaction tx=null;
		
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			Student st=new Student(322,"RAJ","MCA",9936323375L,"raj@gmail.com",5000);
			Student st1=new Student(323,"RAJ","MCA",9936323375L,"raj@gmail.com",6000);
			Student st2=new Student(324,"TAJ","MCA",9936323375L,"taj@gmail.com",7000);
			Student st3=new Student(325,"RAJ","MCA",9936323375L,"raj@gmail.com",8000);
			Student st4=new Student(326,"SAJ","MCA",9936323375L,"saj@gmail.com",8000);
			Student st5=new Student(327,"NAJ","MCA",9936323375L,"naj@gmail.com",4000);
			session.saveOrUpdate(st);session.saveOrUpdate(st1);session.saveOrUpdate(st2);session.saveOrUpdate(st3);session.saveOrUpdate(st4);session.saveOrUpdate(st5);
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
