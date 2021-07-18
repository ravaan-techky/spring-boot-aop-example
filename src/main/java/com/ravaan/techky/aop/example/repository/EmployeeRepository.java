package com.ravaan.techky.aop.example.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ravaan.techky.aop.example.dto.Employee;

/**
 * The Class EmployeeRepository.
 */
@Repository
public class EmployeeRepository {

	/** The employee list. */
	private List<Employee> employeeList = new ArrayList<>();

	/**
	 * Instantiates a new employee repository.
	 */
	public EmployeeRepository() {
		employeeList.add(new Employee(1, "John Simth", "jsimth@xyz.com", "1234567890", 10000.00D));
		employeeList.add(new Employee(11, "Tom Sale", "tsale@xyz.com", "1234567811", 15000.00D));
		employeeList.add(new Employee(12, "Hary Simth", "hsimth@xyz.com", "1234567892", 8000.00D));
		employeeList.add(new Employee(15, "Vishwa Joshep", "vjoshep@xyz.com", "1234567893", 12000.00D));
		employeeList.add(new Employee(22, "Kate Hardly", "khardly@xyz.com", "1234567894", 7000.00D));
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<Employee> findAll() {
		return employeeList;
	}

	/**
	 * Find employee by id.
	 *
	 * @param id the id
	 * @return the optional
	 */
	public Optional<Employee> findEmployeeById(Integer id) {
		return this.employeeList.stream().filter(employee -> {
			return employee.getId() == id;
		}).findFirst();
	}

	/**
	 * Find employee contains name.
	 *
	 * @param name the name
	 * @return the list
	 */
	public List<Employee> findEmployeeContainsName(String name) {
		return this.employeeList.stream().filter(employee -> {
			return employee.getName().contains(name);
		}).collect(Collectors.toList());
	}

	/**
	 * Update employee salary.
	 *
	 * @param id     the id
	 * @param salary the salary
	 * @return the employee
	 */
	public Employee updateEmployeeSalary(Integer id, Double salary) {
		Employee dbEmployee = null;
		Optional<Employee> optional = this.employeeList.stream().filter(t -> {
			return t.getId() == id;
		}).findFirst();
		if (optional.isPresent()) {
			dbEmployee = optional.get();
			dbEmployee.setSalary(salary);
		}
		return dbEmployee;
	}
}
