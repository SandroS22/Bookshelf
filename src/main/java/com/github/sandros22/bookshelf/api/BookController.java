package com.github.sandros22.bookshelf.api;

import com.github.sandros22.bookshelf.entities.Book;
import com.github.sandros22.bookshelf.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<Book> getBooks() {
        return this.bookService.findAll();
    }
}
