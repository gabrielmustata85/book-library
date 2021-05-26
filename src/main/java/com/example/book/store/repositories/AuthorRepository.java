package com.example.book.store.repositories;

import com.example.book.store.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository  extends CrudRepository<Author, Long> {

}
