package com.codegym.casestudy.dto.customer_dto;

import java.util.List;

public class CustomerTypeDto {
    private Integer id;
    private String name;
    private List<CustomerDto> customerDtos;

    public CustomerTypeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CustomerDto> getCustomerDtos() {
        return customerDtos;
    }

    public void setCustomerDtos(List<CustomerDto> customerDtos) {
        this.customerDtos = customerDtos;
    }
}
