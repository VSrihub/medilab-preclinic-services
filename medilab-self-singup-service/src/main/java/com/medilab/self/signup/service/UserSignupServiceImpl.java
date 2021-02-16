/**
 * 
 */
package com.medilab.self.signup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medilab.self.signup.bean.MedilabUserBean;
import com.medilab.self.signup.model.MedilabUser;
import com.medilab.self.signup.repo.UserRepository;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author nsanda
 *
 */
@Service
@Data
@Slf4j
public class UserSignupServiceImpl implements UserSignupService {


	@Autowired
	/**
	 * user Repository
	 */
	private UserRepository userRepo;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#save(com.medilab.self.
	 * signup.bean.MedilabUserBean)
	 */
	@Override
	public MedilabUserBean save(final MedilabUserBean userBean) {
		log.info("inam in medilab user save methods {}" , userBean.toString());
		test();
		final MedilabUser userModel = new MedilabUser();

		// To Convert the bean to the model
		BeanUtils.copyProperties(userBean, userModel);

		userRepo.save(userModel);
		
		log.info("saved data is:{} \t", userModel.toString());

		BeanUtils.copyProperties(userModel, userBean);

		return userBean;
	}
	
	private void test() {
		log.info("inam in medilab user void private methods");
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
		log.info("inam in medilab user update methods {}" , userBean.toString());

		MedilabUser userModel = new MedilabUser();

		// To Convert the bean to the model
		BeanUtils.copyProperties(userBean, userModel);

		userRepo.save(userModel);
		
		log.info("update data is:{} ", userModel.toString());

		BeanUtils.copyProperties(userModel, userBean);

		return userBean;
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
		MedilabUser userModel = new MedilabUser();

		// To Convert the bean to the model
		BeanUtils.copyProperties(userBean, userModel);
		userRepo.delete(userModel);		
		return findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#delete(int)
	 */
	@Override
	public List<MedilabUserBean> delete(int id) {
		userRepo.deleteById(id);
		return findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#findById(int)
	 */
	@Override
	public MedilabUserBean findById(int id) {
		MedilabUser userModel = userRepo.findById(id).get();
		MedilabUserBean userDataBean = new MedilabUserBean();
		BeanUtils.copyProperties(userModel, userDataBean);
		return userDataBean;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.medilab.self.signup.service.UserSignupService#findAll()
	 */
	@Override
	public List<MedilabUserBean> findAll() {
		List<MedilabUser> usersList = userRepo.findAll();
		if(usersList != null && usersList.size() >0) {
			
			List<MedilabUserBean> userBeanList = new ArrayList<>();
			
			usersList.stream().forEach(dbUser->{
				MedilabUserBean userDataBean = new MedilabUserBean();
				BeanUtils.copyProperties(dbUser, userDataBean);
				userBeanList.add(userDataBean);
			});
			return userBeanList;
		}
		return null;
	}

}
