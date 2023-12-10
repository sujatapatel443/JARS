package com.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab1 {
	public static void main(String[] args) {
		try {
			
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //Driver loading
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");// Connection eshtablishement
		Statement st=con.createStatement(); //Prepare statement
		
		String sql="insert into empl values(301,'PAJ',60000)"; // perapre sql query
		int number=st.executeUpdate(sql);  // execute query 
		
		System.out.println("Result:"+number); // process the result
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
