/**
 * 
 */
package com.medilab.self.signup.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medilab.self.signup.model.MedilabUser;

/**
 * @author nsanda
 *
 */
public interface UserRepository extends JpaRepository<MedilabUser, Integer> {

}
