package com.codegym.final_exam.repository;


import com.codegym.final_exam.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
