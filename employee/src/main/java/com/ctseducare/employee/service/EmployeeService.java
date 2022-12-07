package com.ctseducare.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctseducare.employee.dto.EmployeeDTO;
import com.ctseducare.employee.dto.EmployeeDependentDTO;
import com.ctseducare.employee.exception.ResourceNotFoundException;
import com.ctseducare.employee.model.Employee;
import com.ctseducare.employee.model.EmployeeDependent;
import com.ctseducare.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;
    
    public EmployeeDTO insert(EmployeeDTO dto) {
        return insertOrUpdate(dto);
    }
   
    public List<EmployeeDTO> findAll() {
        return repository.findAll().stream().map( e -> { return modelToDTO(e); }).collect(Collectors.toList());
    }
    
    public EmployeeDTO update(EmployeeDTO dto) {
        repository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist!"));
        return insertOrUpdate(dto);
    }
    
    public EmployeeDTO delete(Integer id) {
        Employee employee = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist!"));
        repository.deleteById(id);
        return modelToDTO(employee);
    }
    
    private Employee dtoToModel(EmployeeDTO dto) {
        Employee model = new Employee();
        model.setId(dto.getId());
        model.setName(dto.getName());
        model.setSalary(dto.getSalary());
        model.setBirthday(dto.getBirthday());

        dto.getDependents().stream().forEach(
          (d) -> {
              model.getDependents().add(
              new EmployeeDependent(
                d.getId(),
                d.getName(),
                d.getBirthday(),
                model
            ));
        });
        
        return model;
    }
    
    private EmployeeDTO modelToDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        dto.setSalary(employee.getSalary());
        dto.setBirthday(employee.getBirthday());
        
        for (EmployeeDependent ed : employee.getDependents()) {
            EmployeeDependentDTO edDTO = new EmployeeDependentDTO();
            edDTO.setId(ed.getId());
            edDTO.setName(ed.getName());
            edDTO.setBirthday(ed.getBirthday());
            dto.getDependents().add(edDTO);
        }
        
        return dto;
    }
    
    private void settingIDs(Employee employee, EmployeeDTO dto) {
        employee.getDependents().stream().forEach(
            (d) -> {
                dto.getDependents().stream().forEach(
                    (d2) -> {
                      if (d2.getName().equals(d.getName())) {
                        d2.setId(d.getId());
                      }
                  });
            }
        );
    }
    
    private EmployeeDTO insertOrUpdate(EmployeeDTO dto) {
        Employee result = repository.save(dtoToModel(dto));
        settingIDs(result, dto);
        dto.setId(result.getId());
        return dto;
    }
    
    public Double findSalary(Integer employeeId) {
        Employee employee = repository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist!"));
        return employee.getSalary();
    }
    
}