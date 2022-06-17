package com.codegym.final_exam.service.impl;

import com.codegym.final_exam.model.Product;
import com.codegym.final_exam.repository.IProductRepository;
import com.codegym.final_exam.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }
}
