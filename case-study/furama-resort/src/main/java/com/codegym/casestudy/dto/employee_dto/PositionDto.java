package com.codegym.casestudy.dto.employee_dto;

import com.codegym.casestudy.model.employee.Employee;
import java.util.List;

public class PositionDto {
    private Integer positionId;
    private String positionName;
    private List<Employee> employees;

    public PositionDto() {
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
