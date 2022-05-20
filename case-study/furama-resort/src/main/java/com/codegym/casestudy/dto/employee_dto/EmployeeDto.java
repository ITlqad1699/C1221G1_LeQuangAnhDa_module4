package com.codegym.casestudy.dto.employee_dto;

import com.codegym.casestudy.dto.contract_dto.ContractDto;
import java.util.List;

public class EmployeeDto {
    private Integer id;
    private String idCard;
    private String salary;
    private String name;
    private String birthDay;
    private String phone;
    private String email;
    private String address;
    private String username;
    List<ContractDto> contractDtoList;
    private PositionDto positionDto;
    private DivisionDto divisionDto;
    private EducationDegreeDto educationDegreeDto;

    public EmployeeDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<ContractDto> getContractDtoList() {
        return contractDtoList;
    }

    public void setContractDtoList(List<ContractDto> contractDtoList) {
        this.contractDtoList = contractDtoList;
    }

    public PositionDto getPositionDto() {
        return positionDto;
    }

    public void setPositionDto(PositionDto positionDto) {
        this.positionDto = positionDto;
    }

    public DivisionDto getDivisionDto() {
        return divisionDto;
    }

    public void setDivisionDto(DivisionDto divisionDto) {
        this.divisionDto = divisionDto;
    }

    public EducationDegreeDto getEducationDegreeDto() {
        return educationDegreeDto;
    }

    public void setEducationDegreeDto(EducationDegreeDto educationDegreeDto) {
        this.educationDegreeDto = educationDegreeDto;
    }
}
