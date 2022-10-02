package com.fgh.code.book.service;

import com.fgh.code.book.model.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book saveBook(Book book);

// Read operation
   List<Book> fetchBookList();

    // Update operation
    Optional<Book> updateBook(Book book, Long bookId);

//    Book updateBook(Book book);

    void deleteBookById(Long bookId);

}

