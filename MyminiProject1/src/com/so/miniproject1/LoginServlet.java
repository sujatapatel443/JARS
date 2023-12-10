package com.so.miniproject1;

import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loging.do")
public class LoginServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException, ServletException{
		System.out.println("Service method started-------");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String msg="";
		try {
			
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		if(username.equals(password)) {
			msg="<H1>Dear "+username + " Logging successful and Please proceeds----";
		
		}else {
			msg="<H1> Dear "+ username + " Logging failed.Please try again-----";
		}
		Writer out=res.getWriter();
		
		System.out.println("Srevice method executed successfully-----");
		
		RequestDispatcher rd1=req.getRequestDispatcher("/WEB-INF/header.html");
		rd1.include(req, res);
		RequestDispatcher rd2=req.getRequestDispatcher("/WEB-INF/menu.html");
		rd2.include(req, res);
		out.write(msg);
		//RequestDispatcher rd3=req.getRequestDispatcher("/WEB-INF/login.html");
		//rd3.include(req, res);
		RequestDispatcher rd4=req.getRequestDispatcher("/WEB-INF/footer.html");
		rd4.include(req, res);
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
