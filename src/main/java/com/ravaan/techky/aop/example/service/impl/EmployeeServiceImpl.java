package com.ravaan.techky.aop.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravaan.techky.aop.example.dto.Employee;
import com.ravaan.techky.aop.example.exception.RecordNotFoundException;
import com.ravaan.techky.aop.example.repository.EmployeeRepository;
import com.ravaan.techky.aop.example.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee repository. */
	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	/**
	 * Gets the employee.
	 *
	 * @param employeeId the employee id
	 * @return the employee
	 */
	@Override
	public Employee getEmployee(Integer employeeId) {
		Optional<Employee> optional = employeeRepository.findEmployeeById(employeeId);
		if(!optional.isPresent()) {
			throw new RecordNotFoundException("Failed to find employee with Id " + employeeId);
		}
		return optional.get();
	}

	/**
	 * Update employee salary.
	 *
	 * @param employeeId the employee id
	 * @param salary the salary
	 * @return the employee
	 */
	@Override
	public Employee updateEmployeeSalary(Integer employeeId, Double salary) {
		Employee employee = employeeRepository.updateEmployeeSalary(employeeId, salary);
		if(employee == null) {
			throw new RecordNotFoundException("Failed to update employee with Id " + employeeId);
		}
		return employee;
	}

	/**
	 * Search employee by name.
	 *
	 * @param name the name
	 * @return the list
	 */
	@Override
	public List<Employee> searchEmployeeByName(String name) {
		return employeeRepository.findEmployeeContainsName(name);
	}

}
