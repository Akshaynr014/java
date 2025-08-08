package com.dyashin.sprest.service;

import java.util.List;

import com.dyashin.sprest.dto.Employee;

public interface EmployeeService {
    void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    boolean deleteEmployeeById(int id);
    boolean updateEmployee(Employee emp);
    List<Employee> getAllEmployees();
}
