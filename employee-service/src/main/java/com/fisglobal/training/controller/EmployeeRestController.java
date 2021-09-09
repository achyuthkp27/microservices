package com.fisglobal.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisglobal.training.model.Employee;
import com.fisglobal.training.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.getById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
	
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{id}")
	public boolean deleteEmployee(@PathVariable("id") Integer id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PostMapping("/employees/login")
	public String employeeLogin(@RequestBody Employee employee) {
		boolean validEmployee=employeeService.isValidEmployee(employee.getUsername(), employee.getPassword());
		if(validEmployee) {
			return "Logged in Successfully!";
		}
		else
			return "username or password is not matching";
	}
}
