package com.ravaan.techky.aop.example.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public class Employee {
	
	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The designation. */
	private String designation;

	/** The salary. */
	private Double salary;

	/** The email. */
	private String email;

	/** The phone number. */
	private String phoneNumber;

	/**
	 * Instantiates a new employee.
	 */
	public Employee() {

	}

	/**
	 * Instantiates a new employee.
	 *
	 * @param Id the id
	 * @param name        the name
	 * @param email       the email
	 * @param phoneNumber the phone number
	 * @param salary      the salary
	 */
	public Employee(Integer id, String name, String email, String phoneNumber, Double salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the designation.
	 *
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * Sets the designation.
	 *
	 * @param designation the new designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * Gets the salary.
	 *
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary.
	 *
	 * @param salary the new salary
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}
