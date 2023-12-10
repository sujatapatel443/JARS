package com.hibernate.query;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.india.hibernate.HibernateUtil;
import com.india.hibernate.Student;

public class Lab5A {
	public static void main(String[] args) {
		
		Transaction tx=null;
		
		try {
			SessionFactory factory=HibernateUtil.getSessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			String hql="from  Student s  order by s.balance";
			Query query=session.createQuery(hql);
			
			List<Student> lst=query.list();
			lst.forEach(st->{
				System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getEmail()+"\t"+st.getPhone()+"\t"+st.getBalance());
			});
			System.out.println("*****************");
			// 3rd highest balance
			Student st=lst.get(4);
			System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getEmail()+"\t"+st.getPhone()+"\t"+st.getBalance());
			
			
			// 3rd highest balance
			int size=lst.size();  // if size= 5 means 4th will highest 2nd balance it means index=5-1-1
			Student st1=lst.get(size-1-1);
			System.out.println(st1.getSid()+"\t"+st1.getName()+"\t"+st1.getEmail()+"\t"+st1.getPhone()+"\t"+st1.getBalance());
						
			tx.commit();
			session.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
