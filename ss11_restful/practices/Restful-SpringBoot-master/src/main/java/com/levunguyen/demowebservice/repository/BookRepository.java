package com.levunguyen.demowebservice.repository;

import com.levunguyen.demowebservice.models.Book;
import org.springframework.data.repository.CrudRepository;



public interface BookRepository extends CrudRepository<Book, Long> {
}
