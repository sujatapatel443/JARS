package com.hibernate.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.HibernateUtil;
import com.india.hibernate.Student;

public class Lab4A {
	public static void main(String[] args) {
		
		Transaction tx=null;
		
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			String hql="from Student s where  s.email like ? order by s.email";
			Query query=session.createQuery(hql);
			
			query.setString(0, "%gmail.com");
			List<Student> lst=query.list();
			lst.forEach(st->{
				System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getEmail()+"\t"+st.getPhone());
			});
			
			
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
