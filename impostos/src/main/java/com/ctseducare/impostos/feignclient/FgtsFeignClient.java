package com.ctseducare.impostos.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="service-fgts")
public interface FgtsFeignClient {

    @GetMapping("/fgts/employee/{id}")
    Double calcularFgts(@PathVariable Integer id);

}
