package com.bang.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1C_Delete {

	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory sessionFactory=HibernateUtil.getsessionFactory();
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			//Student st=new Student(11,"Sujata","Varanasi","BCA","UP College");
			Student st=(Student)session.load(Student.class, 11);
			System.out.println(st.getId()+" "+st.getName()+" "+st.getCourse()+" "+st.getAddress()+" "+st.getCollege());
			session.delete(st);
			System.out.println("object deleted from student table"); 
			
			tx.commit();
			session.close();
		
		}catch(Exception ex){
		ex.printStackTrace();
		if(tx!=null)tx.rollback();
		}

	}

}
