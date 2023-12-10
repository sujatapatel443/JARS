package com.sp.jsp;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class JSPProject1 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fnm=req.getParameter("fname");
		
		Date dt=new Date();
		if(fnm==null || fnm.trim().length()==0) {
			fnm="Guest";
		}
		String msg="<h1>Hello "+ fnm+ "<br/>you have sent request on " + dt+"<h1>";
		res.setContentType("text/html");
		res.getWriter().write(msg);
		
		System.out.println("---service method completed---");
	}
}
