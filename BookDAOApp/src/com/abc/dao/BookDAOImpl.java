package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.abc.dto.Book;
import com.abc.factory.HibernateUtil;

public class BookDAOImpl implements BookDAO {

	@Override
	public void saveBook(Book b) {

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

			session.save(book);

			transaction.commit();
			session.close();
		}
	}

	@Override
	public Book readBook(int bid) {

		SessionFactory factory = HibernateUtil.getSessionFactoryy();

		Session session = null;
		if(factory != null)
		{
			session = factory.openSession();
		}

		if(session != null)
		{

			Book book = session.get(Book.class, bid);
			session.close();

			if(book != null)
			{
				return book;
			}
			else
			{
				return null;
			}

		}

		return null;
	}

}
