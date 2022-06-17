package com.codegym.de_thi_thu.service.impl;

import com.codegym.de_thi_thu.model.ProductType;
import com.codegym.de_thi_thu.repository.IProductTypeRepository;
import com.codegym.de_thi_thu.service.IProductTupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTupeService {
    @Autowired
    private IProductTypeRepository productTypeRepository;

    @Override
    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }
}
