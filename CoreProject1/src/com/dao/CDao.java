package com.dao;

import com.dto.ReqDTO;

public class CDao {
	
	public int add(ReqDTO  reqDTO) {
		
		int result =reqDTO.getA()*2 + reqDTO.getB()*3;
		return result;
	}

}
