package com.codegym.de_thi_thu.service.impl;

import com.codegym.de_thi_thu.model.Product;
import com.codegym.de_thi_thu.repository.IProductRepository;
import com.codegym.de_thi_thu.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
