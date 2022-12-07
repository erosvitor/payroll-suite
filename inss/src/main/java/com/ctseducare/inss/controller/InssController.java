package com.ctseducare.inss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.inss.service.InssService;

@RestController
@RequestMapping(path = "/inss")
public class InssController {

    @Autowired
    private InssService service;

    @GetMapping("/employee/{employeeId}")
    Double calcularInss(@PathVariable Integer employeeId) {
        return service.calcularInss(employeeId);
    }

}
