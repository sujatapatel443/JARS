package com.controller;

import com.dto.ReqDTO;
import com.service.BService;

public class AController {
	public static void main(String[] args) {
		int a=15;
		int b=35;
		ReqDTO  reqDTO=new ReqDTO(a,b);
		
		BService bService=new BService();
		int result=bService.add(reqDTO);
		
		System.out.println("Result :"+result);
		
	}

}
