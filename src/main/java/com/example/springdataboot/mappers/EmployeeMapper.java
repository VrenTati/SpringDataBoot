package com.example.springdataboot.mappers;

import com.example.springdataboot.data.Employee;
import com.example.springdataboot.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Service
public class EmployeeMapper {
    public EmployeeDto employeeDto(Employee e){
        if(e.getReportsTo() != null) {
            return new EmployeeDto(e.getId(), e.getLastName(), e.getFirstName(), e.getTitle(), e.getReportsTo().getLastName(), e.getReportsTo().getFirstName(), e.getPhone());
        } else {
            return new EmployeeDto(e.getId(), e.getLastName(), e.getFirstName(), e.getTitle(),"", "", e.getPhone());
        }
    }
}
