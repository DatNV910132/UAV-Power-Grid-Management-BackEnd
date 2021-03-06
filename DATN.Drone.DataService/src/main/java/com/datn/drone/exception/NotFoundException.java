/*
 * 
 */
package com.datn.drone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// TODO: Auto-generated Javadoc
/**
 * The Class NotFoundException.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
	
	/**
	 * Instantiates a new not found exception.
	 */
	public NotFoundException() {
        super();
    }
    
    /**
     * Instantiates a new not found exception.
     *
     * @param message the message
     */
    public NotFoundException(String message) {
        super(message);
    }

}
