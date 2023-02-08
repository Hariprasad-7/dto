package com.datatransfer.web.mapper;

import com.datatransfer.web.dto.EmployeeDto;
import com.datatransfer.web.entity.Employee;
import org.springframework.stereotype.Component;


@Component
public class EmployeResponseDto {


    public EmployeeDto entityToDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCity(employee.getCity());
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        return employeeDto;

    }

    public Employee dtoToEntity(EmployeeDto employeeDto){
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setCity(employeeDto.getCity());
        return employee;

    }


}
