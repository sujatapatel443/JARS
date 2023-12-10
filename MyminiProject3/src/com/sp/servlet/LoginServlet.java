package com.sp.servlet;

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
		String msg="";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); 
			String sql="select * from register where uname=?";
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,uname);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("pwd"));
				dbpwd=rs.getString("pwd");
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		if(dbpwd!=null && dbpwd.equals (pwd)) {
			msg="<h1>Dear " + uname+ " Your login is successfull please proceeds ahead---</h1>";
			Writer out=res.getWriter();
			out.write(msg);
			req.getSession().setAttribute(uname, "uname");
			req.getRequestDispatcher("/login.do").include(req, res);
			
		}else {
			msg="<h1>Dear " + uname +" Your login is failed .Please try again----</h1>";
			Writer out=res.getWriter();
			out.write(msg);
		}
	}

}
