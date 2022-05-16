package com.codegym.service;

import com.codegym.exception.BookRunOut;
import com.codegym.model.Books;
import com.codegym.model.BorrowingCode;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IBooksAppService {
    Page<Books> findAllByName(String keywordName, Pageable pageable);


    Optional<Books> findById(Integer id);

    void borrow(Books books) throws BookRunOut;

    void giveBack(Books books);
}
