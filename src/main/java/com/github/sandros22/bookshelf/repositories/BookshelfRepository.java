package com.github.sandros22.bookshelf.repositories;

import com.github.sandros22.bookshelf.entities.Bookshelf;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookshelfRepository extends MongoRepository<Bookshelf, UUID> {
}
