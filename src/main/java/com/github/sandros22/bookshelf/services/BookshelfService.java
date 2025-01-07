package com.github.sandros22.bookshelf.services;

import com.github.sandros22.bookshelf.repositories.BookshelfRepository;
import org.springframework.stereotype.Service;

@Service
public class BookshelfService {

    private final BookshelfRepository bookshelfRepository;

    public BookshelfService(BookshelfRepository bookshelfRepository) {
        this.bookshelfRepository = bookshelfRepository;
    }
}
