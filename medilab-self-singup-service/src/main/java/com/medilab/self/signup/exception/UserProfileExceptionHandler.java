/**
 * 
 */
package com.medilab.self.signup.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author nsanda
 *
 */
@ControllerAdvice
public class UserProfileExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<UserProfileExceptionData>  handleDuplicateUserProfile(DuplicateUserProfileException due){
		UserProfileExceptionData userProfileExceptionData = new UserProfileExceptionData(
				due.getMessage(),HttpStatus.BAD_REQUEST.value());
		
		return ResponseEntity.status(HttpStatus.OK).body(userProfileExceptionData);
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		    List<UserProfileExceptionData> errorsList = new ArrayList<UserProfileExceptionData>();  
		    
		    ex.getAllErrors().stream().forEach(error->{
		    	UserProfileExceptionData fieldError = new UserProfileExceptionData(error.getDefaultMessage(),
		    			HttpStatus.BAD_REQUEST.value());
		    	errorsList.add(fieldError);
		    });
		  		 
		    return ResponseEntity.status(HttpStatus.OK).body(errorsList);
	}
	
	//Write Exception Handler For handling the user not found
}
