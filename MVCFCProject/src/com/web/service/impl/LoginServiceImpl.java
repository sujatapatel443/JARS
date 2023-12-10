package com.web.service.impl;

import com.web.dao.LoginDao;
import com.web.dao.impl.LoginDaoImpl;
import com.web.dto.LoginDTO;
import com.web.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Override
	public String loginService(LoginDTO loginDto) {
		
		LoginDao loginDao=new LoginDaoImpl();
		
		String dbpw=loginDao.loginDao(loginDto);
				
		return dbpw;
	}

	

}
