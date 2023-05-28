package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	
	private static String url = "jdbc:mysql://localhost:3306/busdb";
	private static String user = "root";
	private static String password_db = "21323966";	
	private static Connection con;
	
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password_db);
			
			
			
		}catch(Exception e) {
			
			System.out.print("Database connection failed");
			
		}
		
		return con; 
	}
	
}




