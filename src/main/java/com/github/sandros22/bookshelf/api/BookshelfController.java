package com.github.sandros22.bookshelf.api;

import com.github.sandros22.bookshelf.entities.Bookshelf;
import com.github.sandros22.bookshelf.excpetions.BookshelfNotSavedException;
import com.github.sandros22.bookshelf.services.BookshelfService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/bookshelf")
public class BookshelfController {

    private final BookshelfService bookshelfService;

    public BookshelfController(BookshelfService bookshelfService) {
        this.bookshelfService = bookshelfService;
    }

    @GetMapping
    public List<Bookshelf> getAllBookshelf() {
        return bookshelfService.getAllBookshelf();
    }

    @PostMapping
    public ResponseEntity<Bookshelf> createBookshelf(@RequestBody Bookshelf bookshelf) {
        try {
            bookshelf.setId(new UUID(1L, 1L));
            bookshelfService.createBookshelf(bookshelf);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (BookshelfNotSavedException e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
