package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.StatementEvent;

import com.mysql.jdbc.Statement;

public class driverUtil implements validateUsers {
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//validating the dirver for login
	public boolean validate(String NIC,String password) {
		
		boolean success = false ;
		
		try {
			con = DBcon.getConnection();
			stmt = (Statement) con.createStatement();
			
			String sql = "SELECT * FROM driver WHERE NIC = '"+NIC+"' and password = '"+password+"'";
			ResultSet result = stmt.executeQuery(sql);
			
			if(result.next()) {
				success = true ;
			}else {
				success = false;
			}
			
			
			}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return success;
	}
	
}
