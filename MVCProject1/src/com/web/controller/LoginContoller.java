package com.web.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dto.LoginDTO;
import com.web.service.LoginService;
import com.web.service.impl.LoginServiceImpl;

@WebServlet("/login.do")
public class LoginContoller extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		LoginDTO loginDto=new LoginDTO(uname,pwd);
		
		LoginService loginService=new LoginServiceImpl();
		
		String dbpwd=loginService.loginService(loginDto);
		
		String msg="";
		if(dbpwd != null && dbpwd.equals(pwd)) {
			msg="<h1>Hi " + uname + " Login is successfull---</h1>";
			Writer out=res.getWriter();
			out.write(msg);
			req.getSession().setAttribute("uname", uname);
			req.getRequestDispatcher("/logout.html").include(req, res);
		}else {
			msg="<h1>Hi " + uname + " Your Login is failed.Please try again----</h1>";
			Writer out=res.getWriter();
			out.write(msg);
		}
		
		
	}

}
