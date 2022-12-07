package com.ctseducare.impostos.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-inss")
public interface InssFeignClient {

    @GetMapping("/inss/employee/{id}")
    Double calcularInss(@PathVariable Integer id);

}
