package com.example.SpringBootwithNosqlDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BookRestController {
	
	@Autowired
	private BookRepsoitory bookRepo;
	
	@PostMapping
	public ResponseEntity<String> addBook(@RequestBody Book book){
		bookRepo.save(book);
		return new ResponseEntity<>("Book Saved",HttpStatus.OK);
	}

	@GetMapping("/books")
	public List<Book> book(){
		return bookRepo.findAll();
	}
	
	@GetMapping("/book/{bookId}")
	public Book getBookById(@PathVariable Integer BookId){
		return bookRepo.findBookId(BookId);
	}
	
	@DeleteMapping("book/{bookId}")
	public String deleteBookById(@PathVariable String id) {
		bookRepo.deleteById(id);
		return "Deleted Successfully";
	}
}
