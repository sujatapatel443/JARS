package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method started---");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String msg="";
		if(username.equals(password)) {
			msg="<H1>Dear "+username+" Logging successful and Welcome to web application-----</H1>";
		}else {
			msg="<H1>Logging failed.Please try again----</H1>";
		}
		Writer out=resp.getWriter();
		out.write(msg);
		System.out.println("Service method executed successfully---");
	}

}
