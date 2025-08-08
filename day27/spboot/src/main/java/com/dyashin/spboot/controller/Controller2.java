package com.dyashin.spboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dyashin.spboot.dto.Employee;
import com.dyashin.spboot.service.EmployeeService;

@RestController
public class Controller2 {

    @Autowired
    EmployeeService employeeservice;

    // GET by ID
    @GetMapping("/search")
    public ResponseEntity<Employee> searchById(@RequestParam(name = "id") int id) {
        Employee emp = employeeservice.getEmployeeById(id);
        if (emp != null) {
            return ResponseEntity.ok(emp);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    


    // GET all employees
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employeeList = employeeservice.getAllEmployees();
        if (employeeList != null && !employeeList.isEmpty()) {
            return ResponseEntity.ok(employeeList);
        } else {
            return ResponseEntity.noContent().build(); // 204 No Content if empty
        }
    }

    // DELETE by ID
    @DeleteMapping("/employees")
    public ResponseEntity<Void> deleteEmployee(@RequestParam(name = "id") int id) {
        boolean isDeleted = employeeservice.deleteEmployeeById(id);
        if (isDeleted) {
            return ResponseEntity.ok().build(); // 200 OK with no body
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST (Create)
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
        Employee savedEmployee = employeeservice.addEmployee(emp);
        if (savedEmployee != null && savedEmployee.getId() > 0) {
            return ResponseEntity.status(201).body(savedEmployee); // 201 Created
        } else {
            return ResponseEntity.status(500).build(); // 500 Internal Server Error
        }
    }

    // PUT (Update)
    @PutMapping("/employees")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        boolean updated = employeeservice.updateEmployee(emp);
        if (updated) {
            return ResponseEntity.ok(emp); // 200 OK
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
    }
}
