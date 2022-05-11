package com.codegym.product_maneger.service.impl;

import com.codegym.product_maneger.model.Product;
import com.codegym.product_maneger.repository.IProductRepository;
import com.codegym.product_maneger.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return this.iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }



    @Override
    public void remove(Product product) {
        this.iProductRepository.delete(product);
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return this.iProductRepository.findById(id);
    }
}
