/**
 * 
 */
package com.medilab.self.signup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author nsanda
 *
 */
@Entity
/*@Setter
@Getter*/
@Data
public class MedilabUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private String fname;
	
	@Column(nullable=false)
	private String lname;
	
	@Column(nullable=false,unique=true)	
	private String email;
	
	@Column(nullable=false,unique=true)
	private String userId;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false,unique=true)
	private String mobile;
	
	private boolean isLocked=false;

}
