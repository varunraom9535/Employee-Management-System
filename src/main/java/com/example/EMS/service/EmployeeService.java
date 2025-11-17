package com.example.EMS.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EMS.entity.Employee;
import com.example.EMS.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	
	}
	
	public void saveEmployee(Employee emp) {
		
		employeeRepository.save(emp);
	
	}
	
	@SuppressWarnings("deprecation")
	public Employee getEmployeebyId(Long id) {
		
		Employee emp = employeeRepository.getOne(id);
		if(emp == null) {
			throw new RuntimeException("Employee not found");
		}
		return emp;
	}
	
	@SuppressWarnings("deprecation")
	public String deleteEmployeeById(long id) {
		
		Employee emp = employeeRepository.getById(id);
		if (emp == null) {
			throw new RuntimeException("Employee not found");
		}
		
		employeeRepository.deleteById(id);;
		return "Deleted: " + emp.getFirstName() + " " + emp.getLastName();
		
	}
	
}
