package com.ravaan.techky.aop.example.dto;

/**
 * The Class Application Error.
 */
public class ApplicationError {

	/** The error message. */
	public String errorMessage;

	/** The description. */
	public String description;

	/** The error code. */
	public Integer errorCode;

	/**
	 * Instantiates a new error.
	 */
	public ApplicationError() {
		// DUMMY
	}

	/**
	 * Instantiates a new error.
	 *
	 * @param errorMessage the error message
	 * @param description  the description
	 * @param errorCode    the error code
	 */
	public ApplicationError(String errorMessage, String description, Integer errorCode) {
		this.errorMessage = errorMessage;
		this.description = description;
		this.errorCode = errorCode;
	}

	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public Integer getErrorCode() {
		return errorCode;
	}

}
