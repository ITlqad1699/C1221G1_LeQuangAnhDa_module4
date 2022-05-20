package com.codegym.casestudy.service.impl;

import com.codegym.casestudy.repository.ICustomerRepository;
import com.codegym.casestudy.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
}
