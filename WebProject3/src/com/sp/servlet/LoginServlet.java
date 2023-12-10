package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/Loging.do"}, loadOnStartup=1)
public class LoginServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config).. LoginServlet.....");
	}
	
	@Override
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		System.out.println("Service method started-------");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String msg="";
		
		if(username.equals(password)) {
			msg="<H1>Dear "+username + " Logging successful and Please proceeds----";
		
		}else {
			msg="<H1> Dear "+ username + "Logging failed.Please try again-----";
		}
		Writer out=res.getWriter();
		out.write(msg);
		System.out.println("Srevice method executed successfully-----");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy().. LoginServlet.........");
	}
	

}
