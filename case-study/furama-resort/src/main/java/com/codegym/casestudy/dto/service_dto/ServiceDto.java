package com.codegym.casestudy.dto.service_dto;

import com.codegym.casestudy.dto.contract_dto.ContractDto;
import java.util.List;

public class ServiceDto {
    private Integer id;
    private String name;
    private String area;
    private String cost;
    private String maxPeople;
    private String standardRoom;
    private String otherConvenience;
    private String poolArea;
    private String numOfFloor;
    private String serviceCode;
    List<ContractDto> contractDtoList;
    private ServiceTypeDto serviceTypeDto;
    private RentTypeDto rentTypeDto;

    public ServiceDto() {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherConvenience() {
        return otherConvenience;
    }

    public void setOtherConvenience(String otherConvenience) {
        this.otherConvenience = otherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumOfFloor() {
        return numOfFloor;
    }

    public void setNumOfFloor(String numOfFloor) {
        this.numOfFloor = numOfFloor;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public List<ContractDto> getContractDtoList() {
        return contractDtoList;
    }

    public void setContractDtoList(List<ContractDto> contractDtoList) {
        this.contractDtoList = contractDtoList;
    }

    public ServiceTypeDto getServiceTypeDto() {
        return serviceTypeDto;
    }

    public void setServiceTypeDto(ServiceTypeDto serviceTypeDto) {
        this.serviceTypeDto = serviceTypeDto;
    }

    public RentTypeDto getRentTypeDto() {
        return rentTypeDto;
    }

    public void setRentTypeDto(RentTypeDto rentTypeDto) {
        this.rentTypeDto = rentTypeDto;
    }
}
