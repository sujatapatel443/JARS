package com.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab2 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			st=con.createStatement();
			
			int res=st.executeUpdate("insert into empl values(401,'SAJ',60000)");
			System.out.println("Result :"+res);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
				try {
					if(con !=null)
					con.close();
					if(st !=null) st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
		
		
	}

}
