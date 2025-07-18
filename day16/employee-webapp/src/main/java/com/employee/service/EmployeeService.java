package com.employee.service;

import com.employee.dto.Employee;
import com.employee.repository.EmployeeRepository;

public class EmployeeService {
    EmployeeRepository repo = new EmployeeRepository();

    public boolean register(Employee emp) {
        return repo.insertEmployee(emp);
    }
}

