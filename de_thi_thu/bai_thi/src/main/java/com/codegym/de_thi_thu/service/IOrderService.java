package com.codegym.de_thi_thu.service;

import com.codegym.de_thi_thu.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

public interface IOrderService {

    Page<Order> findAllProduct(Pageable pageable, String dateStartKey, String dateEndKey);

    Page<Order> findAllByToTalMoney(Pageable pageable, String dateStartKey, String dateEndKey);

    Order findById(Integer orderId);

    void save(Order order);
}
