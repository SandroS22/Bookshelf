package com.github.sandros22.bookshelf.services;

import com.github.sandros22.bookshelf.entities.Bookshelf;
import com.github.sandros22.bookshelf.excpetions.BookshelfNotSavedException;
import com.github.sandros22.bookshelf.repositories.BookshelfRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookshelfService {

    private final BookshelfRepository bookshelfRepository;

    public BookshelfService(BookshelfRepository bookshelfRepository) {
        this.bookshelfRepository = bookshelfRepository;
    }

    public List<Bookshelf> getAllBookshelf() {
        return bookshelfRepository.findAll();
    }

    @Transactional
    public void createBookshelf(Bookshelf bookshelf) {
        try {
            bookshelfRepository.save(bookshelf);
        } catch (Exception e) {
            throw new BookshelfNotSavedException(bookshelf);
        }
    }
}
