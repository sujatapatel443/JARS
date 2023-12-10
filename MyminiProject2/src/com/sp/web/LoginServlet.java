package com.sp.web;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String dbpwd=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement pst=con.prepareStatement("select * from register where uname=?");
			pst.setString(1, uname);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("pwd"));
				dbpwd=rs.getString("pwd");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
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

}
