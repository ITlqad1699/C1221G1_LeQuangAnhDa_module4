package com.codegym.de_thi_thu.repository;

import com.codegym.de_thi_thu.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
