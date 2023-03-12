package com.abc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.model.Student;

public class MainApp {

	public static void main(String[] args)
	{
	  Configuration conf = new Configuration();
	  conf.configure("hibernate.cfg.xml");
	  
	  SessionFactory factory=conf.buildSessionFactory();
	  System.out.println("SessionFactory implementation class name is ::" + factory.getClass().getName());
	  
	  Session session=factory.openSession();
	  System.out.println("Session implementation class name is ::" + session.getClass().getName());
	  
	  Transaction transaction = session.beginTransaction();
	  Student student= new Student();
	  student.setSid(18);
	  student.setSname("kohli");
	  student.setSaddress("RCB");
	  
	  session.save(student);
	  //transaction.commit();
	  
	  session.close();
	  factory.close();
	}

}
