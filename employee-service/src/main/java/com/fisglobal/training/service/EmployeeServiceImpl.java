package com.fisglobal.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.training.model.Employee;
import com.fisglobal.training.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public boolean saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return true;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		return true;
	}

	@Override
	public Employee getById(Integer id) {
		return employeeRepository.getById(id);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public boolean isValidEmployee(String username, String password) {
		Employee emp= employeeRepository.getByUsernameAndPassword(username, password);
		if(emp!=null) {
			return true;
		}
		return false;
	}

}
