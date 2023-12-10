package com.jdbc.database;

import java.sql.*;

public class Lab9 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JDBCUtil.getOracleConnection();
			
			String sql="select * from empl where ename=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,"KAL");
			boolean res=ps.execute();
			if(res==true) {
				rs=ps.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
