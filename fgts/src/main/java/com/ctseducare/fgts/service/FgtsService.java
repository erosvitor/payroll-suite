package com.ctseducare.fgts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.fgts.feignclient.EmployeeFeignClient;

@Service
public class FgtsService {
    
    @Autowired
    EmployeeFeignClient employee;

    public Double calcularFgts(Integer employeeId) {
        return employee.findSalary(employeeId) * 0.08;
    }

}