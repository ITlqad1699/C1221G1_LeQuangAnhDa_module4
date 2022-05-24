package com.codegym.casestudy.dto.contract_dto;

import com.codegym.casestudy.dto.customer_dto.CustomerDto;
import com.codegym.casestudy.dto.service_dto.ServiceDto;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContractDto implements Validator {
    private Integer id;
    private String dateStart;
    private String dateEnd;
    private String deposit;
    private String totalMoney;
    private com.codegym.casestudy.dto.employee_dto.EmployeeDto employeeDto;
    private CustomerDto customerDto;
    private ServiceDto serviceDto;
    public ContractDto() {
    }

    public com.codegym.casestudy.dto.employee_dto.EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(com.codegym.casestudy.dto.employee_dto.EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public ServiceDto getServiceDto() {
        return serviceDto;
    }

    public void setServiceDto(ServiceDto serviceDto) {
        this.serviceDto = serviceDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
