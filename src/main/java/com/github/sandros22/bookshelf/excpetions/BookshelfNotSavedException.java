package com.github.sandros22.bookshelf.excpetions;

import com.github.sandros22.bookshelf.entities.Bookshelf;

public class BookshelfNotSavedException extends RuntimeException {

    private static final String MESSAGE = "Bookshelf not saved: ";
    public BookshelfNotSavedException(Bookshelf bookshelf) {
        super(MESSAGE + bookshelf.getId());
    }
}
