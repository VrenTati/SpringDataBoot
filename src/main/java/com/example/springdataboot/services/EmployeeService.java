package com.example.springdataboot.services;

import com.example.springdataboot.dto.EmployeeDto;
import com.example.springdataboot.mappers.EmployeeMapper;
import com.example.springdataboot.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper mapper;

    public List<EmployeeDto> getEmployees(){
        return employeeRepository.findAll().stream().map(mapper::employeeDto).toList();
    }
}
