package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.abc.dto.User;
import com.abc.factory.HibernateUtil;

public class UserDao {

	public String userService(User user)
	{

		SessionFactory factory = HibernateUtil.getSessionFactoryy();
		Session session = null;
		Transaction transaction = null;


		if(factory != null)
		{
			session = factory.openSession();
		}
		
		if(session != null)
		{
			transaction = session.beginTransaction();

			transaction.commit();
			session.close();
			
			return "success";
			
		}
		return "failure";
	}

}
