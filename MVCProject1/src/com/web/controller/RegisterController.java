package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dto.RegisterRequestDTO;
import com.web.service.RegisterService;
import com.web.service.impl.RegisterServiceImpl;

@WebServlet("/register.do")
public class RegisterController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String cpwd=req.getParameter("confirmpassword");
		String gend=req.getParameter("gender");
		RegisterRequestDTO registerRequestDTO=new RegisterRequestDTO(name,uname,pwd,cpwd,gend);
		
		RegisterService registerService = new RegisterServiceImpl();
		int result=registerService.register(registerRequestDTO);
		
		String msg="";
		if(result==1) {
			msg="Dear "+uname+" Registeration completed..</h1>";
		}else {
			
			msg="Dear "+name+" Registeration Failed..";
		}
		
		req.setAttribute("MSG", msg);
		req.getRequestDispatcher("/success.jsp").include(req, res);
		
		req.getRequestDispatcher("/login.jsp").include(req, res);
	}

}
