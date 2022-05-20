package com.codegym.casestudy.dto.employee_dto;

import com.codegym.casestudy.model.employee.Employee;
import java.util.List;

public class EducationDegreeDto {
    private Integer eduDegreeId;
    private String eduDegreeName;
    private List<Employee> employees;

    public EducationDegreeDto() {
    }

    public Integer getEduDegreeId() {
        return eduDegreeId;
    }

    public void setEduDegreeId(Integer eduDegreeId) {
        this.eduDegreeId = eduDegreeId;
    }

    public String getEduDegreeName() {
        return eduDegreeName;
    }

    public void setEduDegreeName(String eduDegreeName) {
        this.eduDegreeName = eduDegreeName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
