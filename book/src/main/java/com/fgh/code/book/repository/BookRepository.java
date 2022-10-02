package com.fgh.code.book.repository;

import com.fgh.code.book.model.Book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository <Book, Long> {
}
