package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/hello.do", loadOnStartup=0)
public class MyServlet extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config)....");
	}
	
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
	System.out.println("MyServlet service method started------");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	String msg="";
	
	if(username.equals(password)) {
		msg="<H2>Dear "+ username + " Login successful Welcome to our service";
	}else {
		msg="<H2>Dear "+ username + " Login failed. Please try again---";
	}
	Writer out=res.getWriter();
	out.write(msg);
}

	
}
