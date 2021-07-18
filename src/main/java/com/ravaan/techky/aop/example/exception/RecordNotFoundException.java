package com.ravaan.techky.aop.example.exception;

/**
 * The Class RecordNotFoundException.
 */
public class RecordNotFoundException extends RuntimeException {

	/**  serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new record not found exception.
	 *
	 * @param message the message
	 */
	public RecordNotFoundException(String message) {
		super(message);
	}

}
