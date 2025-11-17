package com.example.EMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.EMS.entity.Employee;
import com.example.EMS.service.EmployeeService;

import org.springframework.ui.Model;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String viewHomePages(Model model) {
		model.addAttribute("ListEmployees", employeeService.getAllEmployees());
		return "index";
	}
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showUpdateForm(@PathVariable Long id, Model model) {
		Employee employee = employeeService.getEmployeebyId(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable Long id, Model model) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/";
	}
	
}
