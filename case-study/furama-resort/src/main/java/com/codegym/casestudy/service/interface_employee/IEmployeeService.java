package com.codegym.casestudy.service.interface_employee;

import com.codegym.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll( String keywordName, String divisionKey, String positionKey, String educationDegreeKey, Pageable pageable);

    List<Employee> findAllBy();

    void save(Employee employee);

    Employee findById(Integer id);

    void softDelete(Integer id);
}
