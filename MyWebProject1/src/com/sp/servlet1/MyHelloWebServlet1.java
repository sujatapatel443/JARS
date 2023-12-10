package com.sp.servlet1;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello.do")
public class MyHelloWebServlet1 extends HttpServlet{
	  @Override
	    public void init(ServletConfig config) throws ServletException {
	    	System.out.println("---helloServlet init() method ----");;
	    }
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
			System.out.println("service method started------");
			String username=req.getParameter("username");
			String password=req.getParameter("passowrd");
			String age=req.getParameter("age");
			String course=req.getParameter("course");
			String msg="";
			if(username.equals(password)) {
				msg="<H1>Dear " + username  + " login is successful you can proceeds---";
				System.out.println("--HelloWebServlet service method executed------");
				
			}else {
				msg="<H1>Dear " + username+ " login is failed .---please try again-----";
			}
			Writer out=res.getWriter();
			out.write(msg);
			
		}
		@Override
		public void destroy() {
			System.out.println("HelloWebServlet destroy().. MyServlet.........");
		}

}
