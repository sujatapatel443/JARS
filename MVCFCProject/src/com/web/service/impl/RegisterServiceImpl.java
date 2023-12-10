package com.web.service.impl;

import com.web.dao.RegisterDao;
import com.web.dao.impl.RegisterDaoImpl;
import com.web.dto.RegisterRequestDTO;
import com.web.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public int register(RegisterRequestDTO registerRequestDTO) {
		
		RegisterDao registerDao = new RegisterDaoImpl();
		int res=registerDao.register(registerRequestDTO);
		
		return res;
	}

}
