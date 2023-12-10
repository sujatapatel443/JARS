package com.web.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.dao.LoginDao;
import com.web.dto.LoginDTO;

public class LoginDaoImpl implements LoginDao{

	@Override
	public String loginDao(LoginDTO loginDto) {
		
		String dbpwd=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			PreparedStatement pst=con.prepareStatement("select * from register where uname=?");
			pst.setString(1, loginDto.getUname());
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("pwd"));
				dbpwd=rs.getString("pwd");
				return dbpwd;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dbpwd;
	}

}
