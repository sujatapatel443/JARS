package com.web.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.catalina.connector.Request;

import com.web.dao.RegisterDao;
import com.web.dto.RegisterDto;

public class RegisterDaoIMPL implements RegisterDao{

	@Override
	public int registerDao(RegisterDto registerDto) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			String sql="insert into register values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,registerDto.getName());
			ps.setString(2,registerDto.getUname() );
			ps.setString(3, registerDto.getPwd());
			ps.setString(4, registerDto.getCpwd());
			ps.setString(5,registerDto.getGender());
			if(registerDto.getPwd().equals(registerDto.getCpwd())) {
				
				int res=ps.executeUpdate();
				System.out.println("Registration is successful----"+res);
				return res;
			}else {
				System.out.println("Registration is failed---.Please try again--");
				return 0;
			}
			
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return 0;
		
	}
	
	

}
