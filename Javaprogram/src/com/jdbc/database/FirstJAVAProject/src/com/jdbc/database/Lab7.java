package com.jdbc.database;

import java.sql.*;

public class Lab7 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=JDBCUtil.getOracleConnection();
			String sql="insert into empl values(?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, 902);
			ps.setString(2, "TAJ");
			ps.setFloat(3, 70000);
			int result=ps.executeUpdate();
			System.out.println("Result:"+result);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(con, ps);
		}
	}

}
