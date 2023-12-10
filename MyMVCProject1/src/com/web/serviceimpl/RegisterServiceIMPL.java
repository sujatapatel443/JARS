/**
 * 
 */
package com.web.serviceimpl;

import com.web.dao.RegisterDao;
import com.web.daoimpl.RegisterDaoIMPL;
import com.web.dto.RegisterDto;
import com.web.service.RegisterService;

/**
 * @author 000BFH744
 *
 */
public class RegisterServiceIMPL implements  RegisterService{

	@Override
	public int registerService(RegisterDto registerDto) {
		
		RegisterDao registerDao=new RegisterDaoIMPL();
		int res=registerDao.registerDao(registerDto);
		
		return res;
	}
	
}
