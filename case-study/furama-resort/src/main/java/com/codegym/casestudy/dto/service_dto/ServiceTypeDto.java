package com.codegym.casestudy.dto.service_dto;

import java.util.List;

public class ServiceTypeDto {
    private Integer id;
    private String name;
    private List<ServiceTypeDto> serviceTypeDtoList;

    public ServiceTypeDto() {
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

    public List<ServiceTypeDto> getServiceTypeDtoList() {
        return serviceTypeDtoList;
    }

    public void setServiceTypeDtoList(List<ServiceTypeDto> serviceTypeDtoList) {
        this.serviceTypeDtoList = serviceTypeDtoList;
    }
}
