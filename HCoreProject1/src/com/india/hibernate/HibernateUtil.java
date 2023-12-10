package com.india.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	static SessionFactory sessionFactory=null;
	
	static {
		AnnotationConfiguration	cfg=new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure();
		sessionFactory=cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}

}
