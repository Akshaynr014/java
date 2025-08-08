package com.dyashin.sprest.dao;



import java.util.List;

import com.dyashin.sprest.dto.Employee;

public interface Dao {
    void addEmployee(Employee emp);
    Employee getEmployeeById(int id);
    boolean deleteEmployeeById(int id);
    boolean updateEmployee(Employee emp);
    List<Employee> getAllEmployees();
}

