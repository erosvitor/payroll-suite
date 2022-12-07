package com.ctseducare.inss.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-employee")
public interface EmployeeFeignClient {

    @GetMapping("/employee/{id}/salary")
    Double findSalary(@PathVariable Integer id);

}
