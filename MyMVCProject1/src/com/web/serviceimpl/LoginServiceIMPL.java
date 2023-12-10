package com.web.serviceimpl;

import com.web.dao.LoginDao;
import com.web.daoimpl.LoginDaoIMPL;
import com.web.dto.LoginDto;
import com.web.service.LoginService;

public class LoginServiceIMPL implements LoginService{

	@Override
	public String loginService(LoginDto loginDto) {
		
		LoginDao loginDao=new LoginDaoIMPL();
		String dbpwd=loginDao.loginDao(loginDto);
		return dbpwd;
	}
	
	

}
