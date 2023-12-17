package com.example.springdataboot.controllers;

import com.example.springdataboot.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class EmployeeController {

    public final EmployeeService employeeService;
    @GetMapping("/employees")
    public String showEmployees(Model model){
        model.addAttribute("employees", employeeService.getEmployees());
        return "employees";
    }
}
