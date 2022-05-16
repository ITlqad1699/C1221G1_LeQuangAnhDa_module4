package com.codegym.repository;

import com.codegym.model.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IBooksAppRepository extends JpaRepository<Books,Integer> {
    Page<Books> findAllByNameBooksContaining(String keywordName, Pageable pageable);
}
