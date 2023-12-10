package com.association.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.enitity.MYCustomer;
import com.association.enitity.Request;
import com.association.enitity.TAccount;
import com.association.enitity.TCustomer;
import com.india.hibernate.HibernateUtil;


public class AssociationManyTMany2 {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory f=HibernateUtil.getSessionFactory();
			Session s=f.openSession();
			tx=s.beginTransaction();
			TCustomer cust1=new TCustomer(116, "ARS", "PAR");
			TCustomer cust2=new TCustomer(117, "ARS", "PAR");
			s.save(cust1);s.save(cust2);
			TAccount tac1=new TAccount(19, "10-09-2022", "saving");
			TAccount tac2=new TAccount(20, "10-09-2022", "current");
			s.save(tac1);s.save(tac2);
			Collection<TAccount> accounts=new ArrayList<TAccount>();
			accounts.add(tac1);accounts.add(tac2);
			
			cust1.setAccounts(accounts);
			
			
			tx.commit();
			s.close();
		}catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
		
	}

}
