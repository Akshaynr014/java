package com.dyashin.spboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyashin.spboot.dto.Employee;
import com.dyashin.spboot.exception.EmployeeNotFoundException;
import com.dyashin.spboot.repositoryPackage.EmployeeRepository;

@Service
public class EmployeeserviceDataImp implements EmployeeService {

    @Autowired
    private EmployeeRepository dao;

    // CREATE
    @Override
    public Employee addEmployee(Employee emp) {
        return dao.save(emp);
    }

    // READ by ID
    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> byId = dao.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found");
        }
    }

    // DELETE
    @Override
    public boolean deleteEmployeeById(int id) {
        if (dao.existsById(id)) {
            dao.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    // UPDATE
    @Override
    public boolean updateEmployee(Employee emp) {
        if (dao.existsById(emp.getId())) {
            dao.save(emp);
            return true;
        } else {
            return false;
        }
    }

    // READ all
    @Override
    public List<Employee> getAllEmployees() {
        return dao.findAll();
    }
}
