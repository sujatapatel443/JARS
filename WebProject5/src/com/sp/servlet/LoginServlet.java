package com.sp.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.classfile.Method;

@WebServlet(urlPatterns= {"/Loging.do"}, loadOnStartup=1, initParams= {@WebInitParam(name="email", value="raj@gmail.com"),
		@WebInitParam(name="phone", value="9452645878"),
		@WebInitParam(name="address", value="SONBHADRA")
		})
public class LoginServlet extends HttpServlet{
	ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init(ServletConfig config).. LoginServlet.....");
		String email=config.getInitParameter("email");
		String phone=config.getInitParameter("phone");
		String address=config.getInitParameter("address");
		
		System.out.println("Email :"+email+" ,Phone :"+phone+" ,Address "+address);
	}
	
	@Override
	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		System.out.println("Config parameter value is service Method.class..");
		
		String email=config.getInitParameter("email");
		String phone=config.getInitParameter("phone");
		String address=config.getInitParameter("address");
		
		System.out.println("Email :"+email+" Phone :"+phone+" Address "+address);
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
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy().. LoginServlet.........");
	}
	

}
