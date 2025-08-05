package com.dyashin.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyashin.springmvc.dao.Dao;
import com.dyashin.springmvc.dao.DaoImpl;
import com.dyashin.springmvc.dto.Employee;
import com.dyashin.springmvc.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	Dao dao;
	
//    private final Dao dao = new DaoImpl();

    @Override
    public void addEmployee(Employee emp) {
        dao.addEmployee(emp);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee emp = dao.getEmployeeById(id);
        if (emp == null) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
        }
        return emp;
    }

    @Override
    public boolean deleteEmployeeById(int id) {
        boolean deleted = dao.deleteEmployeeById(id);
        if (!deleted) {
            throw new EmployeeNotFoundException("Employee with ID " + id + " not found for deletion.");
        }
        return true;
    }

    @Override
    public boolean updateEmployee(Employee emp) {
        boolean updated = dao.updateEmployee(emp);
        if (!updated) {
            throw new EmployeeNotFoundException("Employee with ID " + emp.getId() + " not found for update.");
        }
        return true;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = dao.getAllEmployees();
        return list;
    }
}

