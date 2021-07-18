package com.ravaan.techky.aop.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravaan.techky.aop.example.dto.Employee;
import com.ravaan.techky.aop.example.service.EmployeeService;

/**
 * The Class EmployeeController.
 */
@RestController
public class EmployeeController {
	
	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	/**
	 * Gets the employee.
	 *
	 * @param employeeId the employee id
	 * @return the employee
	 */
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	/**
	 * Update employee salary.
	 *
	 * @param employeeId the employee id
	 * @param salary the salary
	 * @return the employee
	 */
	@GetMapping("/employee/{employeeId}/salary/{salary}")
	public Employee updateEmployeeSalary(Integer employeeId, Double salary) {
		return employeeService.updateEmployeeSalary(employeeId, salary);
	}
	
	/**
	 * Search employee by name.
	 *
	 * @param name the name
	 * @return the list
	 */
	@GetMapping("/employee/search/{name}")
	public List<Employee> searchEmployeeByName(String name){
		return employeeService.searchEmployeeByName(name);
	}
}
