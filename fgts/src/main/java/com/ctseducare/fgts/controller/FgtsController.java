package com.ctseducare.fgts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.fgts.service.FgtsService;

@RestController
@RequestMapping(path = "/fgts")
public class FgtsController {

    @Autowired
    private FgtsService service;

    @GetMapping("/employee/{employeeId}")
    Double calcularFgts(@PathVariable Integer employeeId) {
        return service.calcularFgts(employeeId);
    }

}
