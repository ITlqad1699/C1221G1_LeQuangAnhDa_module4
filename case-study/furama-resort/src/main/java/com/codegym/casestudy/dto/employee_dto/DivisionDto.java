package com.codegym.casestudy.dto.employee_dto;

import com.codegym.casestudy.model.employee.Employee;
import java.util.List;

public class DivisionDto {
    private Integer divisionId;
    private String divisionName;
    private List<Employee> employees;

    public DivisionDto() {
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
