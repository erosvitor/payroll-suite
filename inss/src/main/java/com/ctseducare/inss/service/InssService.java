package com.ctseducare.inss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.inss.feignclient.EmployeeFeignClient;

@Service
public class InssService {

    @Autowired
    EmployeeFeignClient employee;

    public Double calcularInss(Integer employeeId) {
        double salary = employee.findSalary(employeeId).doubleValue();
        return inss(salary);
    }

    private double inss(double salary) {
        double rateRange1 = 7.5 / 100.0;
        double rateRange2 = 9.0 / 100.0;
        double rateRange3 = 12.0 / 100.0;
        double rateRange4 = 14.0 / 100.0;

        double inss = 0.0;

        if (salary <= 1212.00) {
            inss = salary * rateRange1;

        } else if (salary <= 2427.35) {
            inss = 1212.00 * rateRange1;
            inss += (salary - 1212.00) * rateRange2;

        } else if (salary <= 3641.03) {
            inss = 1212.00 * rateRange1;
            inss += (2427.35 - 1212.00) * rateRange2;
            inss += (salary - 2427.35) * rateRange3;

        } else if (salary <= 7087.22) {
            inss = 1212.00 * rateRange1;
            inss += (2427.35 - 1212.00) * rateRange2;
            inss += (3641.03 - 2427.35) * rateRange3;
            inss += (salary - 3641.03) * rateRange4;
        } else {
            inss = 828.39;
        }

        return inss;
    }

}

