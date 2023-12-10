package com.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	
	public static final String driverClass="oracle.jdbc.driver.OracleDriver";
	public static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String username="system";
	public static final String password="system";
	
	static {
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static Connection getOracleConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	static void cleanup(Connection con, Statement st) {
		try {
			if(con !=null)
			con.close();
			if(st !=null) st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	static void cleanup(Connection con, Statement st, ResultSet rs) {
		try {
			if(con !=null)
			con.close();
			if(st !=null) st.close();
			if(rs !=null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
