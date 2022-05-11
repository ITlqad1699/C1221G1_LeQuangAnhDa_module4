package com.codegym.product_maneger.repository;

import com.codegym.product_maneger.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {

}
