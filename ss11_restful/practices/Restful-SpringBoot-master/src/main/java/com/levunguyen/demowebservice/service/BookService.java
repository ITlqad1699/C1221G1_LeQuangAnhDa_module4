package com.levunguyen.demowebservice.service;


import com.levunguyen.demowebservice.models.Book;

public interface BookService {
    Iterable<Book> getAllBooks();
    Book getBookById(Long id);
    void saveBook(Book book);
    void deleteBookById(Long id);
}
