package com.codegym.de_thi_thu.service;

import com.codegym.de_thi_thu.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IProductService {


    List<Product> findAll();
}
