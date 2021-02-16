/**
 * 
 */
package com.medilab.self.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medilab.self.signup.bean.MedilabUserBean;
import com.medilab.self.signup.service.UserSignupService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class SelfSignupResource {

	@Autowired
	private UserSignupService signupService;

	@PostMapping("/mediplab-user")
	public ResponseEntity<MedilabUserBean> saveUser(@RequestBody MedilabUserBean userBean) {
		userBean = signupService.save(userBean);
		return ResponseEntity.status(HttpStatus.CREATED).body(userBean);
	}

	@PutMapping("/mediplab-user")
	public ResponseEntity<MedilabUserBean> updateUser(@RequestBody MedilabUserBean userBean) {
		userBean = signupService.update(userBean);
		return ResponseEntity.status(HttpStatus.OK).body(userBean);
	}

	@GetMapping("/mediplab-user")
	public ResponseEntity<List<MedilabUserBean>> getAllUsers() {
		List<MedilabUserBean> userBeanList = signupService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(userBeanList);
	}

	@GetMapping("/mediplab-user/{userId}")
	public ResponseEntity<MedilabUserBean> getUserById(@PathVariable("userId") String userid) {
		MedilabUserBean userBean = signupService.findById(Integer.valueOf(userid));
		return ResponseEntity.status(HttpStatus.OK).body(userBean);
	}

	@DeleteMapping("/mediplab-user/{userId}")
	public ResponseEntity<List<MedilabUserBean>> deleteUser(@PathVariable("userId") String userid) {
		List<MedilabUserBean> userBeanList = signupService.delete(Integer.valueOf(userid));
		return ResponseEntity.status(HttpStatus.OK).body(userBeanList);
	}
}
