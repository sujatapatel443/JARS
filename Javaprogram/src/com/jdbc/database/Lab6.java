
package com.jdbc.database;

import java.sql.*;
import java.util.Scanner;

public class Lab6 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null; // Statement , PeraparedStatement, Callable
		ResultSet rs=null;
		
		try {
			con=JDBCUtil.getOracleConnection();
			st=con.createStatement();
			System.out.println("Please Enter a Name to select record from DB:");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			String sql="select * from empl where ename='"+name+"'";
			
			//select * from empl where ename='KAL'
			boolean result=st.execute(sql);
			System.out.println("Result :"+result);
			if(result==true) {
				rs=st.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(con, st, rs);
		}
	}

}
