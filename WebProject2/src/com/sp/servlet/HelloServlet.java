package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		System.out.println("HelloServlet service method started-------");
		String username=req.getParameter("username");
	    String msg="<H1>Dear "+username + " welcome to HelloServlet page----";
		
		Writer out=res.getWriter();
		out.write(msg+"<br/>");
		System.out.println("HelloServlet service method executed successfully-----");
	}
	

}
