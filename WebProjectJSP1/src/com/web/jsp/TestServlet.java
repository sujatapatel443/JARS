package com.web.jsp;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test.do")
public class TestServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String fname=req.getParameter("fname");
		
		Date dt=new Date();
		if(fname==null || fname.trim().length()==0) {
			fname="Guest";
		}
		
		//String msg="<h1>Hi " +fname +"<br/> You have sent request on "+dt+"</h1>";
		
		//res.getWriter().write(msg);
		
		req.setAttribute("NM", fname);
		req.setAttribute("DT", dt);
		req.getRequestDispatcher("show.jsp").forward(req, res);
		
		System.out.println("service method executed...");
		
	}
	
}
