package com.codegym.service.impl;

import com.codegym.exception.BookRunOut;
import com.codegym.model.Books;
import com.codegym.model.BorrowingCode;
import com.codegym.repository.IBooksAppRepository;
import com.codegym.service.IBooksAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BooksAppService implements IBooksAppService {
    @Autowired
    IBooksAppRepository iBooksAppRepository;

    @Override
    public Page<Books> findAllByName(String keywordName, Pageable pageable) {
        return this.iBooksAppRepository.findAllByNameBooksContaining(keywordName, pageable);
    }

    @Override
    public Optional<Books> findById(Integer id) {
        return this.iBooksAppRepository.findById(id);
    }

    @Override
    public void borrow(Books books) throws BookRunOut {
        if (books.getQuantity() > 0 && books.getId() != null) {
            books.setQuantity(books.getQuantity() - 1);
            this.iBooksAppRepository.save(books);
        } else {
            throw new BookRunOut();
        }
    }

    @Override
    public void giveBack(Books books) {
        books.setQuantity(books.getQuantity() + 1);
        this.iBooksAppRepository.save(books);
    }
}
