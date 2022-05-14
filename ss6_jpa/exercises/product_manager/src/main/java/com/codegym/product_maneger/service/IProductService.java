package com.codegym.product_maneger.service;

import com.codegym.product_maneger.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);


    void remove(Product product);


    Optional<Product> findById(Integer id);

   Page<Product> findAllByName(String keyword, Pageable pageable);

    List<String> getProductCode();
}
