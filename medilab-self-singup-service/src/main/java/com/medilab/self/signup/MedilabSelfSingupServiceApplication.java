package com.medilab.self.signup;

import javax.validation.Validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class MedilabSelfSingupServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedilabSelfSingupServiceApplication.class, args);
	}
	
	@Bean
	public Validator  validator() {
		return new LocalValidatorFactoryBean();
	}

}
