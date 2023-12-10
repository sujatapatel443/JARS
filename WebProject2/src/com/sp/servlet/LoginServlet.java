package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loging.do")
public class LoginServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException {
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
		
		RequestDispatcher rd=req.getRequestDispatcher("/hello.do");
		rd.include(req, res); //rd.forwad(req, res);
		System.out.println("After forward method.....");
		out.write("<br/>After forward method.....");
	}
	

}
