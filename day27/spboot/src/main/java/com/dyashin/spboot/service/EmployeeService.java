package com.dyashin.spboot.service;

import java.util.List;

import com.dyashin.spboot.dto.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    boolean deleteEmployeeById(int id);
    boolean updateEmployee(Employee emp);
    List<Employee> getAllEmployees();
}
