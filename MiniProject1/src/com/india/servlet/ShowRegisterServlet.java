package com.india.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showregister.jlc")
public class ShowRegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service() Of ShowRegisterServlet started...");
		
		RequestDispatcher rd1=req.getRequestDispatcher("/WEB-INF/header.html"); rd1.include(req, res);
		RequestDispatcher rd2=req.getRequestDispatcher("/WEB-INF/menu.html"); rd2.include(req, res);
		RequestDispatcher rd3=req.getRequestDispatcher("/WEB-INF/register.html"); rd3.include(req, res);
		RequestDispatcher rd4=req.getRequestDispatcher("/WEB-INF/footer.html"); rd4.include(req, res);
		
		System.out.println("service() Of ShowRegisterServlet completed...");
		
	}

}
