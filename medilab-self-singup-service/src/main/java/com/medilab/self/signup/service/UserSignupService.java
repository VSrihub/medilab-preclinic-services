/**
 * 
 */
package com.medilab.self.signup.service;

import java.util.List;

import com.medilab.self.signup.bean.MedilabUserBean;
import com.medilab.self.signup.exception.DuplicateUserProfileException;

/**
 * @author nsanda
 *
 */
public interface UserSignupService {

	public MedilabUserBean save(MedilabUserBean userBean) throws DuplicateUserProfileException;
	public MedilabUserBean update(MedilabUserBean userBean);
	public List<MedilabUserBean> delete(MedilabUserBean userBean);
	public List<MedilabUserBean> delete(int id);
	
	public MedilabUserBean findById(int id);
	public List<MedilabUserBean> findAll();
}
