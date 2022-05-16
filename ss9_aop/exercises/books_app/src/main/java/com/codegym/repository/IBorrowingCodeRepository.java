package com.codegym.repository;

import com.codegym.model.BorrowingCode;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IBorrowingCodeRepository extends JpaRepository<BorrowingCode,Integer> {

}
