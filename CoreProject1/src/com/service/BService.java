package com.service;

import com.dao.CDao;
import com.dto.ReqDTO;

public class BService {
	
	public int add(ReqDTO  reqDTO) {
		
		CDao cDao=new CDao();
		int res=cDao.add(reqDTO);
		
		return res;
	}

}
