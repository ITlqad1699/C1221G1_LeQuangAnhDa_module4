package com.codegym.final_exam.service.impl;


import com.codegym.final_exam.model.ProductType;
import com.codegym.final_exam.repository.IProductTypeRepository;
import com.codegym.final_exam.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
}
