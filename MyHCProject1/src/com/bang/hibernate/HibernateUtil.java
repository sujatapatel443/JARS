package com.bang.hibernate;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class HibernateUtil {
	
	static SessionFactory sessionFactory=null;
	static {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure();
		sessionFactory=cfg.buildSessionFactory();
	}
	public static SessionFactory getsessionFactory() {
		return sessionFactory;
	}

}
