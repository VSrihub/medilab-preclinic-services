/**
 * 
 */
package com.medilab.self.signup.exception;

import lombok.Getter;

/**
 * @author nsanda
 *
 */
@Getter
public class DuplicateUserProfileException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	private int code;
	
	public DuplicateUserProfileException() {
		
	}
	
	public DuplicateUserProfileException(String message) {
		this.message=message;
	}	
	
	public DuplicateUserProfileException(String message, int code) {
		this.message=message;
		this.code=code;
	}	

}
