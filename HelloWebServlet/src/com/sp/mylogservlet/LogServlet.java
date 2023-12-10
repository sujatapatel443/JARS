package com.sp.mylogservlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login.do")
public class LogServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException  {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String msg="";
		
		if(username.equals(password)) {
			msg="<H1>Dear " + username + " Loging successful and welcome in our application-------";
		}else {
			msg="<H1>Dear "+ username + " Loging failed.Please try again ! thanku-------- ";
		}
		
		Writer out=res.getWriter();
		out.write(msg);
		
		
	}

}
