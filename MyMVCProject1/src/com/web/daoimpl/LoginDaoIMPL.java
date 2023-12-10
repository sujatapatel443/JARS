package com.web.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.dao.LoginDao;
import com.web.dto.LoginDto;

public class LoginDaoIMPL implements LoginDao{

	@Override
	public String loginDao(LoginDto loginDto) {
		
		
		String dbpwd=null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			String sql="select * from register where uname=(?)";
			
			PreparedStatement pst=con.prepareStatement(sql);
			
			pst.setString(1,loginDto.getUname() );
			 
			ResultSet rs=pst.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("pwd"));
				
				dbpwd=rs.getString("pwd");
				return dbpwd;
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return dbpwd;
	}
	
	

}
