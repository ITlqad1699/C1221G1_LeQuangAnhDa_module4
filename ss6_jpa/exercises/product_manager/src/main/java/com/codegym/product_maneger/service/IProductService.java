package com.codegym.product_maneger.service;

import com.codegym.product_maneger.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);


    void remove(Product product);


    Optional<Product> findById(Integer id);
}
