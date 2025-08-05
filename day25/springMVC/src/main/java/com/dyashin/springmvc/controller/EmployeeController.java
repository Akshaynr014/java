package com.dyashin.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model for JSP data binding
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dyashin.springmvc.dto.Employee;
import com.dyashin.springmvc.exception.EmployeeNotFoundException;
import com.dyashin.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // Show search form
    @GetMapping("/searchemployee")
    public String displayUser() {
        return "searchEmployee";
    }

    // Process form submission
    @GetMapping("/search")
    public String searchByEmployeeId(@RequestParam("id") int id, Model model) {
        try {
            Employee employee = service.getEmployeeById(id);
            model.addAttribute("employee", employee);  // key: "employee" for JSP
        } catch (EmployeeNotFoundException e) {
            model.addAttribute("error", e.getMessage());  // key: "error" for JSP
        }
        return "searchEmployee";
    }
    
    // Show Add Employee Form
    @GetMapping("/addemployee")
    public String showAddEmployeeForm() {
        return "addEmployee"; // corresponds to addEmployee.jsp
    }

    // Handle form submission (manual extraction, like search method)
    @PostMapping("/add")
    public String addEmployee(@ModelAttribute("employee") Employee employee, Model model) {
        try {
            service.addEmployee(employee);
            model.addAttribute("message", "Employee added successfully!");
        } catch (Exception e) {
            model.addAttribute("error", "Failed to add employee: " + e.getMessage());
        }

        return "addEmployee"; // Return to the same form JSP
    }

 // Show Delete Form
    @GetMapping("/deleteemployee")
    public String showDeleteForm() {
        return "deleteEmployee"; // maps to deleteEmployee.jsp
    }

    // Handle deletion by ID
    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id, Model model) {
        try {
            service.deleteEmployeeById(id);
            model.addAttribute("message", "Employee deleted successfully!");
        } catch (EmployeeNotFoundException e) {
            model.addAttribute("error", "Failed to delete: " + e.getMessage());
        }
        return "deleteEmployee";
    }



    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = service.getAllEmployees();
        model.addAttribute("employeeList", employees); // used in listEmployees.jsp
        return "listEmployees";
    }
    
 // Show Update Form
    @GetMapping("/updateform")
    public String showUpdateForm() {
        return "updateEmployee";
    }

    // Update Employee
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee employee, Model model) {
        boolean updated = service.updateEmployee(employee);
        if (updated) {
            model.addAttribute("msg", "Employee updated successfully!");
        } else {
            model.addAttribute("error", "Employee not found!");
        }
        return "updateEmployee";
    }
   
}