package com.codegym.de_thi_thu.repository;

import com.codegym.de_thi_thu.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductTypeRepository extends JpaRepository<ProductType,Integer> {
}
