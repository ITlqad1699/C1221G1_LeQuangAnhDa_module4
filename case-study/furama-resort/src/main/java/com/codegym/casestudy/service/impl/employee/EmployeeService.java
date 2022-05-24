package com.codegym.casestudy.service.impl.employee;

import com.codegym.casestudy.model.employee.Employee;
import com.codegym.casestudy.repository.employee.IEmployeeRepository;
import com.codegym.casestudy.service.interface_employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAll(String keywordName, String divisionKey, String positionKey,String educationKey, Pageable pageable) {
        return this.iEmployeeRepository.findAllByQuery("%"+keywordName+"%",divisionKey,positionKey,educationKey,pageable);
    }

    @Override
    public List<Employee> findAllBy() {
        return this.iEmployeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        this.iEmployeeRepository.save(employee);
    }

    @Override
    public Employee findById(Integer id) {
        return this.iEmployeeRepository.findById(id).get();
    }

    @Override
    public void softDelete(Integer id) {
        this.iEmployeeRepository.softDelete(id);
    }
}
