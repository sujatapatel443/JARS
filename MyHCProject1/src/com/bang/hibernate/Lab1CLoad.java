package com.bang.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Lab1CLoad {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory factory=HibernateUtil.getsessionFactory();
			Session session=factory.openSession();
			tx=session.beginTransaction();
			
			StudentEntityMapping st = (StudentEntityMapping)session.load(StudentEntityMapping.class,11);
			
			System.out.println(st.getSid()+"\t"+st.getName()+"\t"+st.getQualification()+"\t"+st.getDob()
			+"\t"+st.getCousres()+"\t"+st.getEmail()+"\t"+st.getPhone()+"\t"+st.getMarks());
			
			
			tx.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		
		}
		
		
	}


}
