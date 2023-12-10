package com.jdbc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=JDBCUtil.getOracleConnection();
			
			String sql="delete from empl where eid=?";
			ps=con.prepareStatement(sql);
			
			System.out.println("Please Enter a Eid to delete record from EMPL:");
			Scanner sc=new Scanner(System.in);
			int eid=sc.nextInt();
			ps.setInt(1, eid);
			
			int result=ps.executeUpdate();
			System.out.println("Result:"+result);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.cleanup(con, ps);
		}
	}

}
