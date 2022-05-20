package com.codegym.casestudy.service.impl;

import com.codegym.casestudy.repository.IEmployeeRepository;
import com.codegym.casestudy.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;
}
