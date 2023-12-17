package com.example.springdataboot.repositories;

import com.example.springdataboot.data.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}