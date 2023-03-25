package com.abc.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	private HibernateUtil(){
		
	}
	public static SessionFactory getSessionFactoryy() {
		if(sessionFactory == null) {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

}
