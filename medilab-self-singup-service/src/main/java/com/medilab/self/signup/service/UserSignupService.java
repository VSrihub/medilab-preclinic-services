/**
 * 
 */
package com.medilab.self.signup.service;

import java.util.List;

import com.medilab.self.signup.bean.MedilabUserBean;

/**
 * @author nsanda
 *
 */
public interface UserSignupService {

	public MedilabUserBean save(MedilabUserBean userBean);
	public MedilabUserBean update(MedilabUserBean userBean);
	public List<MedilabUserBean> delete(MedilabUserBean userBean);
	public List<MedilabUserBean> delete(int id);
	
	public MedilabUserBean findById(int id);
	public List<MedilabUserBean> findAll();
}
