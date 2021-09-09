package com.fisglobal.training.service;

import java.util.List;

import com.fisglobal.training.model.Employee;

public interface EmployeeService {
	public boolean saveEmployee(Employee employee);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployee(Integer id);

	public Employee getById(Integer id);

	public List<Employee> findAll();
	
	public boolean isValidEmployee(String username,String password);

}
