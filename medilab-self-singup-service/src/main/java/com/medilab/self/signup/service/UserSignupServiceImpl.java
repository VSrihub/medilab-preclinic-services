/**
 * 
 */
package com.medilab.self.signup.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medilab.self.signup.bean.MedilabUserBean;
import com.medilab.self.signup.model.MedilabUser;
import com.medilab.self.signup.repo.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Service
@Slf4j
public class UserSignupServiceImpl implements UserSignupService {

	@Autowired
	private UserRepository userRepo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#save(com.medilab.self.
	 * signup.bean.MedilabUserBean)
	 */
	@Override
	public MedilabUserBean save(MedilabUserBean userBean) {
		log.info("inam in medilab user save methods" + userBean.toString());

		MedilabUser userModel = new MedilabUser();

		// To Convert the bean to the model
		BeanUtils.copyProperties(userBean, userModel);

		userRepo.save(userModel);
		
		log.info("saved data is:\t"+userModel.toString());

		BeanUtils.copyProperties(userModel, userBean);

		return userBean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medilab.self.signup.service.UserSignupService#update(com.medilab.self.
	 * signup.bean.MedilabUserBean)
	 */
	@Override
	public MedilabUserBean update(MedilabUserBean userBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.medilab.self.signup.service.UserSignupService#delete(com.medilab.self.
	 * signup.bean.MedilabUserBean)
	 */
	@Override
	public List<MedilabUserBean> delete(MedilabUserBean userBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#delete(int)
	 */
	@Override
	public List<MedilabUserBean> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#findById(int)
	 */
	@Override
	public MedilabUserBean findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#findAll()
	 */
	@Override
	public List<MedilabUserBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
