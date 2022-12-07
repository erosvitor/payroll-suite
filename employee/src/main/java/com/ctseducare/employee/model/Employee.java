package com.ctseducare.employee.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    private static final long serialVersionUID = -3174874204511928665L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double salary;
    private LocalDate birthday;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<EmployeeDependent> dependents = new HashSet<>(0);

    public Employee() {
     
    }
    
    public Employee(Integer id, String name, Double salary, LocalDate birthday, Set<EmployeeDependent> dependents) {
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

    public Set<EmployeeDependent> getDependents() {
        return dependents;
    }

    public void setDependents(Set<EmployeeDependent> dependents) {
        this.dependents = dependents;
    }

}
