package com.github.sandros22.bookshelf.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Bookshelf {
    @Id
    private UUID id;
    private String name;
    private String description;
    private List<Book> books;
}
