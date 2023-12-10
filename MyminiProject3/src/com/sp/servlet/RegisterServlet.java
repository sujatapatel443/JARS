package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String cpwd=req.getParameter("confirmpassword");
		String gender=req.getParameter("gender");
		String dbpwd=null;
		String msg="";
		
		if(cpwd.equals(pwd)) {

			msg="<h2>Dear "+uname+" Your registration is successfull Congratulations!------</h2>";
			Writer out=res.getWriter();
			out.write(msg);
		}else {
			msg="<h2>Dear "+uname+" You entered incorrect password.Please entered correct password and try again----</h2>";
			Writer out=res.getWriter();
			out.write(msg);
		}
	}

}
