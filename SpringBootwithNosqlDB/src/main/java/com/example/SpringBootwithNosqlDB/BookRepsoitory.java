package com.example.SpringBootwithNosqlDB;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepsoitory extends MongoRepository<Book, String>{

	public Book findBookId(Integer bookId);
}
