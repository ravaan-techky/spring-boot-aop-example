package com.ravaan.techky.aop.example.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ravaan.techky.aop.example.constant.ErrorCodes;
import com.ravaan.techky.aop.example.dto.ApplicationError;
import com.ravaan.techky.aop.example.exception.RecordNotFoundException;

/**
 * The Class ExceptionController.
 */
@RestControllerAdvice
public class ExceptionController {

	/**
	 * Record not found exception.
	 *
	 * @param exception the exception
	 * @return the application error
	 */
	@ExceptionHandler(RecordNotFoundException.class)
	public ApplicationError recordNotFoundException(RecordNotFoundException exception) {
		ApplicationError error = new ApplicationError(exception.getMessage(), exception.getLocalizedMessage(), ErrorCodes.RECORD_NOT_FOUND.getErrorCode());
		return error;
	}
	
	/**
	 * General exception.
	 *
	 * @param exception the exception
	 * @return the application error
	 */
	@ExceptionHandler(Exception.class)
	public ApplicationError generalException(Exception exception) {
		ApplicationError error = new ApplicationError(exception.getMessage(), exception.getLocalizedMessage(), ErrorCodes.INTERNAL_SERVER_ERROR.getErrorCode());
		return error;
	}
}
