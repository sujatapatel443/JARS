package com.web.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dto.LoginDto;
import com.web.service.LoginService;
import com.web.serviceimpl.LoginServiceIMPL;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	String dbpwd=null;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		LoginDto loginDto=new LoginDto(uname,pwd);
		
		LoginService loginService=new LoginServiceIMPL();
		dbpwd=loginService.loginService(loginDto);
		
		String msg="";
		Writer out=res.getWriter();
		if(dbpwd!=null && dbpwd.equals(pwd)) {
			msg="<h1>For Login click here----";
			msg="<h1>Dear "+uname +" You logged in successfully ";
			out.write(msg);
			//req.getSession().setAttribute("uname", uname);
			req.getRequestDispatcher("/logout.jsp").include(req, res);
			
			
		}else {
			msg="<h1>Dear "+uname+" Your login is failed. Please try again Thank you---";
			out.write(msg);
		}
	}

}
