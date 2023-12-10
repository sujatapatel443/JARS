package com.sp.servlet1;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns= {"/login.do"} ,loadOnStartup=0)
public class MyServlet extends HttpServlet{
    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("---Servlet init() method ----");;
    }
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		System.out.println("service method started------");
		String username=req.getParameter("username");
		String password=req.getParameter("passowrd");
		String age=req.getParameter("age");
		String course=req.getParameter("course");
		String msg="";
		if(username.equals(password)) {
			msg="<H1>Dear " + username  + " loging is successful you can proceeds---";
			System.out.println("--service method executed------");
			
		}else {
			msg="<H1>Dear " + username+ " loging is failed .---please try again-----";
		}
		Writer out=res.getWriter();
		out.write(msg);
		System.out.println("service method() MyServlet completed-----");
		RequestDispatcher rd=req.getRequestDispatcher("/hello.do");
		//rd.forward(req, res);
		
		rd.include(req, res);
		System.out.println("After service method() MyServlet completed-----");
		out.write("<br/>----Aaftre forword method-----");
		
	}
	@Override
	public void destroy() {
		System.out.println("destroy().. MyServlet.........");
	}

}
