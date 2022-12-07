package com.ctseducare.employee.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {

    private Integer id;
    private String name;
    private Double salary;
    private LocalDate birthday;
    private List<EmployeeDependentDTO> dependents = new ArrayList<>(0);
    
    public EmployeeDTO() {
        
    }
 
    public EmployeeDTO(Integer id, String name, Double salary, LocalDate birthday, List<EmployeeDependentDTO> dependents) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
        this.dependents = dependents;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<EmployeeDependentDTO> getDependents() {
        return dependents;
    }

    public void setDependents(List<EmployeeDependentDTO> dependents) {
        this.dependents = dependents;
    }

}