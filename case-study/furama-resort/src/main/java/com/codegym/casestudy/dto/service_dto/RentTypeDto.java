package com.codegym.casestudy.dto.service_dto;

import java.util.List;

public class RentTypeDto {
    private Integer id;
    private String rentTypeName;
    private String rentTypeCost;
    private List<ServiceDto> serviceDtoList;

    public RentTypeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public String getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(String rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<ServiceDto> getServiceDtoList() {
        return serviceDtoList;
    }

    public void setServiceDtoList(List<ServiceDto> serviceDtoList) {
        this.serviceDtoList = serviceDtoList;
    }
}
