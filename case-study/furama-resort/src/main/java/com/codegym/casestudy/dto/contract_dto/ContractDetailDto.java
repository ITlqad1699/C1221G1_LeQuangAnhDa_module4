package com.codegym.casestudy.dto.contract_dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class ContractDetailDto implements Validator {
    private Integer id;
    private String Quantity;
    private AttachServiceDto attachServiceDto;
    private ContractDto contractDto;
    public ContractDetailDto() {
    }

    public ContractDetailDto(Integer id, String quantity) {
        this.id = id;
        Quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public AttachServiceDto getAttachServiceDto() {
        return attachServiceDto;
    }

    public void setAttachServiceDto(AttachServiceDto attachServiceDto) {
        this.attachServiceDto = attachServiceDto;
    }

    public ContractDto getContractDto() {
        return contractDto;
    }

    public void setContractDto(ContractDto contractDto) {
        this.contractDto = contractDto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
