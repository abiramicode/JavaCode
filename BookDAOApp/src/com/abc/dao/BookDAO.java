package com.abc.dao;

import com.abc.dto.Book;

public interface BookDAO {
	
	public void saveBook(Book b);
	
	public Book readBook(int bid);

}
