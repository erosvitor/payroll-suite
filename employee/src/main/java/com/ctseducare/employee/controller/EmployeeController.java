package com.ctseducare.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.employee.dto.EmployeeDTO;
import com.ctseducare.employee.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    ResponseEntity<EmployeeDTO> insert(@RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok(service.insert(employee));
    }

    @GetMapping
    ResponseEntity<List<EmployeeDTO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping
    ResponseEntity<EmployeeDTO> update(@RequestBody EmployeeDTO employee) {
        return ResponseEntity.ok(service.update(employee));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<EmployeeDTO> delete(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.delete(id));
    }
    
    @GetMapping("/{id}/salary")
    ResponseEntity<Double> findSalary(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.findSalary(id));
    }

}
