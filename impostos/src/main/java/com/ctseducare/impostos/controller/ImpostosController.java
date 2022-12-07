package com.ctseducare.impostos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.impostos.dto.ImpostosDTO;
import com.ctseducare.impostos.service.ImpostosService;

@RestController
@RequestMapping(path = "/impostos")
public class ImpostosController {

    @Autowired
    private ImpostosService service;

    @GetMapping("/employee/{employeeId}")
    ResponseEntity<ImpostosDTO> calcularImpostos(@PathVariable Integer employeeId) {
        return ResponseEntity.ok(service.calcularImpostos(employeeId));
    }

}

