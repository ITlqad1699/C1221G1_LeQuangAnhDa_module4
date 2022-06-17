package com.codegym.final_exam.repository;


import com.codegym.final_exam.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
