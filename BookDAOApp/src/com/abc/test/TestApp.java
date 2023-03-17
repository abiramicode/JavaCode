package com.abc.test;

import java.io.IOException;

import com.abc.dao.BookDAO;
import com.abc.dto.Book;
import com.abc.factory.BookDAOFactory;

public class TestApp {

	public static void main(String args[]) throws IOException
	{
		BookDAO dao = BookDAOFactory.getInstance();
		
		Book book=new Book();
		book.setBname("ORM");
		book.setBcost(550.5f);
		
		dao.saveBook(book);
		
		System.in.read();
		
		
		System.out.println("READING OPERATION");
		int bid=1;
		Book readBook = dao.readBook(bid);
		if(readBook != null) {
			System.out.println(readBook);
		}
		else
		{
			System.out.println("Record not available in this id" +bid);
		}
		
	}
}
