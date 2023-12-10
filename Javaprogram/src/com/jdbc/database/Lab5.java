package com.jdbc.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab5 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			con=JDBCUtil.getOracleConnection();
			st=con.createStatement();
			String sql="insert into empl values(901,'KAL', 60000)";
			// "insert into empl values("+eid+",'"+ename+"',"+slaray ; 
			boolean res=st.execute(sql);
			System.out.println("Result:"+res);
			if(res==true) {
				rs=st.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getFloat("salary"));
				}
			}
			
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			JDBCUtil.cleanup(con, st, rs);
		}
		
		
	}

}
