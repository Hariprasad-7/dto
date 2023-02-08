package com.datatransfer.web.controller;


import com.datatransfer.web.dto.EmployeeDto;
import com.datatransfer.web.entity.Employee;
import com.datatransfer.web.mapper.EmployeResponseDto;
import com.datatransfer.web.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeController {


    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private EmployeResponseDto employeResponseDto;


    @GetMapping("/get")
    public String print(){
        return "Hello world";
    }

    @PostMapping("/save")
    public Employee SaveEmploye(@RequestBody Employee employee){
        return employeRepository.save(employee);

    }

    @GetMapping("/get/{id}")
    public EmployeeDto getEmployees(@PathVariable int id){

       Employee employee=  employeRepository.findById(id).get();
       return employeResponseDto.entityToDto(employee);



    }
}
