package com.sp.web;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("---RegisterServlet service method() started----");
		
		String name=req.getParameter("name");
		String uname=req.getParameter("username");
		String pwd=req.getParameter("password");
		String cpwd=req.getParameter("confirmpassword");
		String gender=req.getParameter("gender");
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			String sql="insert into register values(?,?,?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, uname);
			pst.setString(3, pwd);
			pst.setString(4, cpwd);
			pst.setString(5, gender);

			String msg="";
			if(pwd.equals(cpwd)) {
				int rs=pst.executeUpdate();
				if(rs==1) {
					System.out.println("Result :"+rs);
					msg="<h1>Dear " + uname +" Your Registration is successfull Please proceeds ahead---</h1>";
					
					
				}else {
					msg="<h1>Dear " + uname +" Your Registration is failed.Please try again---</h1>";
					
				}
				
				
			}else {
				msg="<h1>Dear " + uname +" Your Registration is failed.Please provide correct pwd and cpwd---</h1>";
				
			}
			Writer out=res.getWriter();
			out.write(msg);
			//req.getRequestDispatcher("/logout.html").include(req, res);
			System.out.println("--RegisterServlet service method() completed---");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
