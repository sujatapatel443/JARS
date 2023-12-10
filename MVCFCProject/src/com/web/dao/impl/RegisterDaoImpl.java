package com.web.dao.impl;

import java.sql.*;

import com.web.dao.RegisterDao;
import com.web.dto.RegisterRequestDTO;

public class RegisterDaoImpl implements RegisterDao{

	@Override
	public int register(RegisterRequestDTO registerRequestDTO) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			String sql="insert into register values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, registerRequestDTO.getName());
			ps.setString(2, registerRequestDTO.getUname());
			ps.setString(3, registerRequestDTO.getPwd());
			ps.setString(4, registerRequestDTO.getCpwd());
			ps.setString(5, registerRequestDTO.getGender());
			
			if(registerRequestDTO.getPwd().equals(registerRequestDTO.getCpwd())) {
				int res=ps.executeUpdate();
				System.out.println("Successfully registration done:"+res);
				return res;
				
			}else {
				return 0;
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

}
