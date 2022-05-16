package com.codegym.service;

import com.codegym.exception.NotFoundBorrowCode;
import com.codegym.model.BorrowingCode;

import java.util.List;
import java.util.Optional;

public interface IBorrowingCodeService {
    Optional<BorrowingCode> findById(Integer id) throws NotFoundBorrowCode;

    void saveBookCode(BorrowingCode borrowingCode);


    void delete(BorrowingCode borrowingCode);
}
