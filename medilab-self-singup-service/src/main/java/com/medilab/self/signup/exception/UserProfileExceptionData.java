/**
 * 
 */
package com.medilab.self.signup.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;

/**
 * @author nsanda
 *
 */
@Getter
public class UserProfileExceptionData {

	private String message;
	private int code;
	private LocalDateTime timeStamp;
	
	public UserProfileExceptionData() {
		
	}
	
	public UserProfileExceptionData(String message, int code) {
		this.message = message;
		this.code = code;
		this.timeStamp = LocalDateTime.now();
	}
	
}
