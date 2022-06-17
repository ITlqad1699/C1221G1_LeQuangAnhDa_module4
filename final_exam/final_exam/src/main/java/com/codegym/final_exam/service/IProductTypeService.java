package com.codegym.final_exam.service;



import com.codegym.final_exam.model.ProductType;

import java.util.List;

public interface IProductTypeService {
    List<ProductType> findAll();
}
