package com.ravaan.techky.aop.example.service;

import java.util.List;

import com.ravaan.techky.aop.example.dto.Employee;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {

	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	public List<Employee> getAllEmployee();
	
	/**
	 * Gets the employee.
	 *
	 * @param employeeId the employee id
	 * @return the employee
	 */
	public Employee getEmployee(Integer employeeId);
	
	/**
	 * Update employee salary.
	 *
	 * @param employeeId the employee id
	 * @param salary the salary
	 * @return the employee
	 */
	public Employee updateEmployeeSalary(Integer employeeId, Double salary);
	
	/**
	 * Search employee by name.
	 *
	 * @param name the name
	 * @return the list
	 */
	public List<Employee> searchEmployeeByName(String name);
}
