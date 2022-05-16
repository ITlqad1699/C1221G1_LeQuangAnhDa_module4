package com.codegym.service.impl;

import com.codegym.exception.NotFoundBorrowCode;
import com.codegym.model.BorrowingCode;
import com.codegym.repository.IBorrowingCodeRepository;
import com.codegym.service.IBorrowingCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BorrowingCodeService implements IBorrowingCodeService {
    @Autowired
    IBorrowingCodeRepository iBorrowingCodeRepository;

    @Override
    public Optional<BorrowingCode> findById(Integer id) throws NotFoundBorrowCode {
        Optional<BorrowingCode> borrowingCode = this.iBorrowingCodeRepository.findById(id);
        if(id != null){
            return borrowingCode;
        } else {
            throw new NotFoundBorrowCode();
        }
    }

    @Override
    public void saveBookCode(BorrowingCode borrowingCode) {
        Integer num = (int) ((Math.floor(Math.random()) * 10000 + 99999));
        borrowingCode.setBookCode(num);
        this.iBorrowingCodeRepository.save(borrowingCode);
    }

    @Override
    public void delete(BorrowingCode borrowingCode) {
        this.iBorrowingCodeRepository.delete(borrowingCode);
    }
}
