/**
 * 
 */
package com.medilab.self.signup;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.medilab.self.signup.bean.MedilabUserBean;
import com.medilab.self.signup.service.UserSignupService;

/**
 * @author nsanda
 *
 */
public class UserSignupServiceTests extends MedilabSelfSingupServiceApplicationTests {

	@Autowired
	private UserSignupService userService;
	
	@Test
	public void testSave() {
		MedilabUserBean userBean = new MedilabUserBean();
		userBean.setFname("User");
		userBean.setLname("test1");
		userBean.setEmail("testUser1@email.com");
		userBean.setUserId("testUser");
		userBean.setPassword("testUser@123");
		userBean.setMobile("0987654321");
		
		MedilabUserBean dbSavedUserBean = userService.save(userBean);
		assertNotNull(dbSavedUserBean);
		assertNotNull(dbSavedUserBean.getId());		
		assertThat(dbSavedUserBean.getId());
		assertEquals(userBean.getPassword(),dbSavedUserBean.getPassword());
		
	}
	
	@Test
	public void testFindById() {
		MedilabUserBean dbSavedUserBean =  userService.findById(1);
		assertNotNull(dbSavedUserBean);
		assertNotNull(dbSavedUserBean.getId());		
		assertThat(dbSavedUserBean.getId());
		assertEquals("testUser@123",dbSavedUserBean.getPassword());
	}
	
	@Test
	public void testFindAll() {
		List<MedilabUserBean> dbSavedUserList =  userService.findAll();
		assertNotNull(dbSavedUserList);
		assertEquals(1, dbSavedUserList.size());
	}
}
