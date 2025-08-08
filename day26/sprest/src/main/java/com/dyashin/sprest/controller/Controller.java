package com.dyashin.sprest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dyashin.sprest.dto.Employee;
import com.dyashin.sprest.dto.EmployeeResponse;
import com.dyashin.sprest.service.EmployeeService;

//@org.springframework.stereotype.Controller
@RestController
public class Controller {

	@Autowired
	EmployeeService employeeservice;

	@GetMapping("/search")
	//@ResponseBody
	public EmployeeResponse searchById(@RequestParam(name = "id") int id) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		Employee employeeById = employeeservice.getEmployeeById(id);

		if (employeeById != null) {
			employeeResponse.setStatusCode(200);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Search by id");
			employeeResponse.setBeans(Arrays.asList(employeeById));
		} else {
			employeeResponse.setStatusCode(404);
			employeeResponse.setMessage("failure");
			employeeResponse.setDescription("Search by id");
			employeeResponse.setBeans(null);
		}
		return employeeResponse;
	}

	@GetMapping("/employees")
//	@ResponseBody
	public EmployeeResponse getAllEmployees() {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		List<Employee> employeeList = employeeservice.getAllEmployees(); // should return a list

		if (employeeList != null && !employeeList.isEmpty()) {
			employeeResponse.setStatusCode(200);
			employeeResponse.setMessage("Success");
			employeeResponse.setDescription("Fetched all employees");
			employeeResponse.setBeans(employeeList);
		} else {
			employeeResponse.setStatusCode(404);
			employeeResponse.setMessage("Failure");
			employeeResponse.setDescription("No employees found");
			employeeResponse.setBeans(null);
		}

		return employeeResponse; // ✅ Correct return type
	}

	@DeleteMapping("/employees")
//	@ResponseBody
	public EmployeeResponse deleteEmployee(@RequestParam(name = "id") int id) {
		EmployeeResponse response = new EmployeeResponse();

		boolean isDeleted = employeeservice.deleteEmployeeById(id); // returns true/false

		if (isDeleted) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Employee deleted with ID: " + id);
			response.setBeans(null);
		} else {
			response.setStatusCode(404);
			response.setMessage("Failure");
			response.setDescription("Employee not found with ID: " + id);
			response.setBeans(null);
		}

		return response;
	}

//	@PostMapping("/employees")
//	@ResponseBody
//	public String createEmployee(@RequestBody Employee emp) {
//		employeeservice.addEmployee(emp);
//		return "Employee created successfully with ID: " + emp.getId();
//	}

	   @PostMapping("/employees")
	//    @ResponseBody
	    public EmployeeResponse createEmployee(@RequestBody Employee emp) {
	        EmployeeResponse response = new EmployeeResponse();
	        employeeservice.addEmployee(emp); // Add and persist employee

	        if (emp != null && emp.getId() > 0) {
	            response.setStatusCode(201);
	            response.setMessage("Success");
	            response.setDescription("Employee created successfully");
	            response.setBeans(Arrays.asList(emp));
	        } else {
	            response.setStatusCode(500);
	            response.setMessage("Failure");
	            response.setDescription("Failed to create employee");
	            response.setBeans(null);
	        }
	        return response;
	    }

//	@PutMapping("/employees")
//	@ResponseBody
//	public String updateEmployee(@RequestBody Employee emp) {
//		employeeservice.updateEmployee(emp);
//		return "Employee updated successfully with ID: " + emp.getId();
//	}
	@PutMapping("/employees")
//	@ResponseBody
	public EmployeeResponse updateEmployee(@RequestBody Employee emp) {
	    EmployeeResponse response = new EmployeeResponse();

	    boolean updated = employeeservice.updateEmployee(emp);

	    if (updated) {
	        response.setStatusCode(200);
	        response.setMessage("Success");
	        response.setDescription("Employee updated successfully with ID: " + emp.getId());
	        response.setBeans(Arrays.asList(emp));
	    } else {
	        response.setStatusCode(404);
	        response.setMessage("Failure");
	        response.setDescription("Employee not found for update");
	        response.setBeans(null);
	    }

	    return response;
	}

}
