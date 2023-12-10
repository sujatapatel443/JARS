package com.jdbc.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab3 {
	public static void main(String[] args) {
		 Connection con=null;
		 Statement st=null;
		 
		 try {
			 con=JDBCUtil.getOracleConnection();
			st=con.createStatement();
			String sql= "update empl set ename='AUS' where eid=401";
			int res=st.executeUpdate(sql);
			System.out.println("Updation done:"+res);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(con, st);
		}
		 
	}

}
