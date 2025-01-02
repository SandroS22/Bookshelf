package com.github.sandros22.bookshelf.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Book {
    @Id
    private UUID id;
    private String title;
    private String author;
    private String description;
    private String publisher;
    private String isbn;
}

