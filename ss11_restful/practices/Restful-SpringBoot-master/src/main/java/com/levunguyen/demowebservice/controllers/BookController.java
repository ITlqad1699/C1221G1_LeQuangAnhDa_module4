package com.levunguyen.demowebservice.controllers;

import com.levunguyen.demowebservice.models.Book;
import com.levunguyen.demowebservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> getListBook(){
        return new ResponseEntity<>((List<Book>) bookService.getAllBooks(), HttpStatus.OK);
    }

    @PostMapping("/api/books")
    public ResponseEntity<Void> createBook(@RequestBody Book book){
        bookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
