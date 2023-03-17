package com.abc.factory;

import com.abc.dao.BookDAO;
import com.abc.dao.BookDAOImpl;

public class BookDAOFactory {

	private static BookDAOImpl BookdaoImpl;
	private BookDAOFactory(){

	}
	public static BookDAO getInstance()
	{
		if(BookdaoImpl == null) {
			BookdaoImpl = new BookDAOImpl();
	}
   return BookdaoImpl;
}
}
