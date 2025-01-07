package com.github.sandros22.bookshelf.services;

import com.github.sandros22.bookshelf.entities.Book;
import com.github.sandros22.bookshelf.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
