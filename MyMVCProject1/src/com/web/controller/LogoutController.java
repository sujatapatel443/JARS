package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout.do")
public class LogoutController extends HttpServlet{
	String msg=null;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("LogoutController service() method started-------");
		HttpSession session=req.getSession();
		String uname=(String)session.getAttribute("uname");
		//session.invalidate();
		//System.out.println(session.getId());
		
		System.out.println("LogoutController service() method completed -----");
		res.getWriter().write("<h1>Dear " +uname+" You logged out successfully-----");
		req.getRequestDispatcher("/logout.jsp");
		msg="<h1>Dear "+" User"+" For Login Please click here";
		res.getWriter().write(msg);
		req.getRequestDispatcher("/login.jsp").include(req, res);
	}

}
