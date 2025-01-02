package com.github.sandros22.bookshelf.repositories;

import com.github.sandros22.bookshelf.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
