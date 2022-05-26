package com.codegym.casestudy.service.impl.employee;

import com.codegym.casestudy.dto.employee_dto.EmployeeDto;
import com.codegym.casestudy.model.employee.Employee;
import com.codegym.casestudy.repository.employee.IEmployeeRepository;
import com.codegym.casestudy.service.interface_employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAllEmployee(String keywordName, String divisionKey, String positionKey, String educationKey, Pageable pageable) {
        return this.iEmployeeRepository.findAllByQuery("%" + keywordName + "%", divisionKey, positionKey, educationKey, pageable);
    }

    @Override
    public List<Employee> findAll() {
        return iEmployeeRepository.findAll();
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

    @Override
    public void deleteCheck(Integer[] idCheck) {
        this.iEmployeeRepository.deleteCheck(Arrays.asList(idCheck));
    }


    @Override
    public void checkExists(EmployeeDto employeeDto, BindingResult bindingResult) {

        Employee existsEmail = this.iEmployeeRepository.findFirstByEmail(employeeDto.getEmail());

        Employee existsPhone = this.iEmployeeRepository.findFirstByPhone(employeeDto.getPhone());

        Employee existsIdCard = this.iEmployeeRepository.findFirstByIdCard(employeeDto.getIdCard());

        if (employeeDto.getId() == null) {

            if (!"".equals(employeeDto.getPhone())) {
                if (existsPhone != null) {
                    bindingResult.rejectValue("phone", "phone.duplicate", "errors");
                }
            }

            if (!"".equals(employeeDto.getEmail())) {
                if (existsEmail != null) {
                    bindingResult.rejectValue("email", "email.duplicate", "errors");
                }
            }

            if (!"".equals(employeeDto.getIdCard())) {
                if (existsIdCard != null) {
                    bindingResult.rejectValue("idCard", "id.card.duplicate", "errors");
                }
            }
        } else {
            if (existsPhone != null) {
                if (!existsPhone.getId().equals(employeeDto.getId())) {
                    bindingResult.rejectValue("phone", "phone.duplicate", "errors");
                }
            }

            if (existsEmail != null) {
                if (!existsEmail.getId().equals(employeeDto.getId())) {
                    bindingResult.rejectValue("email", "email.duplicate", "errors");
                }
            }

            if (existsIdCard != null) {
                if (!existsIdCard.getId().equals(employeeDto.getId())) {
                    bindingResult.rejectValue("idCard", "id.card.duplicate", "errors");
                }
            }
        }
    }
}
