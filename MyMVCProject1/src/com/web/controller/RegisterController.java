package com.web.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dto.RegisterDto;
import com.web.service.RegisterService;
import com.web.serviceimpl.RegisterServiceIMPL;

@WebServlet("/register.do")
public class RegisterController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String cpwd=req.getParameter("confirmpassword");
		String gender=req.getParameter("gender");
		String msg="";
		
		RegisterDto registerDto=new RegisterDto(name,uname,pwd,cpwd,gender);
		RegisterService registerService=new  RegisterServiceIMPL();
		int result=registerService.registerService(registerDto);
		Writer out=res.getWriter();
		if(result==1) {
			msg="<h1>Dear "+uname+" Your Registratoin is successfull----";
			out.write(msg);
			req.getRequestDispatcher("/login.jsp").include(req, res);
			
		}else {
			msg="<h1>Dear "+uname+" Your login is failed .Please try again----";
			out.write(msg);
			req.getRequestDispatcher("/register.jsp").include(req, res);
			
		}
		
		
		
	}

}
