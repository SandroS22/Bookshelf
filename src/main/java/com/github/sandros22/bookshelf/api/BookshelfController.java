package com.github.sandros22.bookshelf.api;

import com.github.sandros22.bookshelf.services.BookshelfService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookshelfController {

    private final BookshelfService bookshelfService;
    
    public BookshelfController(BookshelfService bookshelfService) {
        this.bookshelfService = bookshelfService;
    }

}
