package com.ctseducare.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctseducare.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
