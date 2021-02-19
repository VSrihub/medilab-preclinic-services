/**
 * 
 */
package com.medilab.self.signup.bean;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.medilab.self.signup.exception.ExceptionMessagesConstant;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Data
public class MedilabUserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
   private int id;
	
     @NotEmpty(message="first name shoud not be empty or null")
	private String fname;
	
     @NotEmpty(message="Last name shoud not be empty or null")
	private String lname;
	
     @NotEmpty(message="Email shoud not be empty or null")
     @Pattern(regexp=ExceptionMessagesConstant.EMAIL_REG_EXPR)
	private String email;
	
     @NotEmpty(message="User Id not be empty or null")
	private String userId;
	
     @NotEmpty(message="Password not be empty or null")
	private String password;
	
     @NotEmpty(message="Mobile NUmber not be empty or null")
     @Pattern(regexp=ExceptionMessagesConstant.MOBILE_REG_EXPR)
	private String mobile;

}
