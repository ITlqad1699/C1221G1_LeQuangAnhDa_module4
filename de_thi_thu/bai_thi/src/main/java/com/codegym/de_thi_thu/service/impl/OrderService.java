package com.codegym.de_thi_thu.service.impl;

import com.codegym.de_thi_thu.model.Order;
import com.codegym.de_thi_thu.repository.IOderRepository;
import com.codegym.de_thi_thu.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOderRepository oderRepository;


    @Override
    public Page<Order> findAllProduct(Pageable pageable, String dateStartKey, String dateEndKey) {
        if(dateEndKey.equals("") && dateStartKey.equals("")){
            return this.oderRepository.findAll(pageable);
        }else if (dateEndKey.equals("")){
            return this.oderRepository.findAllByPurchaseDateAfter(dateStartKey,pageable);
        }else if(dateStartKey.equals("")){
            return this.oderRepository.findAllByPurchaseDateBefore(dateEndKey,pageable);
        }else {
            return this.oderRepository.findAllByPurchaseDateAfterAndPurchaseDateBefore(pageable,dateStartKey,dateEndKey);
        }
    }

    @Override
    public Page<Order> findAllByToTalMoney(Pageable pageable, String dateStartKey, String dateEndKey) {
        return this.oderRepository.findAllByTotalMoney(pageable);
    }

    @Override
    public Order findById(Integer orderId) {
        return this.oderRepository.findById(orderId).orElse(null);
    }

    @Override
    public void save(Order order) {
        this.oderRepository.save(order);
    }
}
