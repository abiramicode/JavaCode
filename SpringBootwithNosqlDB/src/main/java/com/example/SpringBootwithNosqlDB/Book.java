package com.example.SpringBootwithNosqlDB;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.mongodb.lang.NonNull;

@Document
public class Book {

	@Id
	private String id;
	@NonNull
	private Integer bookId;
	@NonNull
	private String bookName;
	@NonNull
	private String bookAuthor;
	@NonNull
	private Double bookCost;
 

	public Book(String id, Integer bookId, String bookName, String bookAuthor, Double bookCost) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
}