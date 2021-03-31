/**
 * 
 */
package com.medilab.self.signup.bean;

import java.io.Serializable;

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
	
	private String fname;
	
	private String lname;
	
	private String email;
	
	private String userId;
	
	private String password;
	
	private String mobile;

}
