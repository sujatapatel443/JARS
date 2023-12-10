package com.web.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dto.LoginDTO;
import com.web.dto.RegisterRequestDTO;
import com.web.service.LoginService;
import com.web.service.LogoutService;
import com.web.service.RegisterService;
import com.web.service.impl.LoginServiceImpl;
import com.web.service.impl.LogoutServiceImpl;
import com.web.service.impl.RegisterServiceImpl;

@WebServlet(urlPatterns= {"/login.do","/register.do","/logout.do"})
public class MyFrontController extends HttpServlet{
	
	LoginService loginService;
	RegisterService registerService;
	LogoutService logoutService ;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		loginService=new LoginServiceImpl();
		registerService = new RegisterServiceImpl();
		logoutService = new LogoutServiceImpl();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		if(req.getRequestURI().endsWith("login.do")) {
			

			String uname=req.getParameter("username");
			String pwd=req.getParameter("password");
			LoginDTO loginDto=new LoginDTO(uname,pwd);
			
			String dbpwd=loginService.loginService(loginDto);
			
			String msg="";
			if(dbpwd != null && dbpwd.equals(pwd)) {
				msg="<h1>Hi " + uname + " Login is successfull---</h1>";
				Writer out=res.getWriter();
				out.write(msg);
				req.getSession().setAttribute("uname", uname);
				req.getRequestDispatcher("/logout.html").include(req, res);
			}else {
				msg="<h1>Hi " + uname + " Your Login is failed.Please try again----</h1>";
				Writer out=res.getWriter();
				out.write(msg);
			}
		
		}
		
		if(req.getRequestURI().endsWith("register.do")) {
			
			String name=req.getParameter("name");
			String uname=req.getParameter("username");
			String pwd=req.getParameter("password");
			String cpwd=req.getParameter("confirmpassword");
			String gend=req.getParameter("gender");
			RegisterRequestDTO registerRequestDTO=new RegisterRequestDTO(name,uname,pwd,cpwd,gend);
			
			int result=registerService.register(registerRequestDTO);
			
			String msg="";
			if(result==1) {
				msg="Dear "+uname+" Registeration completed..</h1>";
			}else {
				
				msg="Dear "+name+" Registeration Failed..";
			}
			
			req.setAttribute("MSG", msg);
			req.getRequestDispatcher("/success.jsp").include(req, res);
			
			req.getRequestDispatcher("/login.jsp").include(req, res);
			
		}
		
		if (req.getRequestURI().endsWith("logout.do")) {

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

}
