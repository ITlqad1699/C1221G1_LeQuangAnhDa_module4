package com.codegym.product_maneger.repository;

import com.codegym.product_maneger.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {

    Page<Product> findAllByNameContaining(String keyword, Pageable pageable);

    @Query(value = "select product_code from product", nativeQuery =true)
    List<String> getProductCode();

}
