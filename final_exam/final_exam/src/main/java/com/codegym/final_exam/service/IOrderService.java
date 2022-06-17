package com.codegym.final_exam.service;


import com.codegym.final_exam.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IOrderService {

    Page<Order> findAllProduct(Pageable pageable, String dateStartKey, String dateEndKey);

    Page<Order> findAllByToTalMoney(Pageable pageable, String dateStartKey, String dateEndKey);

    Order findById(Integer orderId);

    void save(Order order);
}
