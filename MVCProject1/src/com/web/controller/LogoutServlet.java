package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service started of LogoutServlet..");
		
		
		HttpSession session=req.getSession();
		String uname=(String)session.getAttribute("uname");
		session.invalidate();
		
		System.out.println(session.getId());
		//System.out.println(session.isNew());
		System.out.println("service started of LogoutServlet..");
		
		//res.getWriter().write("Dear "+uname+" Logged out successfully...");
		String msg="DEAR "+uname+" Logged out successfully...";
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("/index.jsp").include(req, res);
	}

}
