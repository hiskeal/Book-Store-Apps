package com.fgh.code.book.controller;

import com.fgh.code.book.model.Book;
import com.fgh.code.book.service.BookService;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
@Autowired
   private BookService bookService;

    // Save operation
    @PostMapping("/books")
    public Book saveBook(@Valid @RequestBody Book book) {
        return bookService.saveBook(book);
    }
//
//    @GetMapping("/findAllBooks")
//    List<Book> findAllBooks(){
//        return bookService.findAllBooks();
//    }

    // Read operation
    @GetMapping("/books")
    public List<Book> fetchBookList()
    {
        return bookService.fetchBookList();
    }

    // Update operation
    @PutMapping("/books/{id}")
    public Optional<Book> updateBook(@RequestBody Book book,
                                     @PathVariable("id") Long bookId)
    {
        return bookService.updateBook(book, bookId);
    }
//
//    @PostMapping("/books")
//    public Book saveBook(@RequestBody Book book) {
//
//        return bookService.saveBook(book);
//
//    }

    // Delete operation
    @DeleteMapping("/books/{id}")

    public String deleteBookById(@PathVariable("id") Long bookId) {
        bookService.deleteBookById(bookId);
        return "Deleted Successfully";
    }
}
