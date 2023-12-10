
package com.jdbc.database;

import java.sql.*;

public class Lab4 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=JDBCUtil.getOracleConnection();
			st=con.createStatement();
			
			String sql="select * from empl";
			boolean res=st.execute(sql); // if boolean is tree means select query..
			if(res==true) {
				rs=st.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getFloat("salary"));
				}
			}
		
		}catch(Exception  ex) {
			ex.printStackTrace();
		}finally {
			JDBCUtil.cleanup(con, st, rs);
		}
		
	}

}
