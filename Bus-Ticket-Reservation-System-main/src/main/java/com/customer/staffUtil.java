package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class staffUtil implements validateUsers {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public boolean validate(String email, String password) {
		
		
	  	boolean success = false ; 
		//ArrayList<customer> cus = new ArrayList<>();
		
		//validate
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "select * from employee where email= '"+email+"' and password= '"+password+"' ";
			
			ResultSet result = stmt.executeQuery(sql);
			
//			while(rs.next()) {
//				int id = rs.getInt(1);
//				String name = rs.getString(2);
//				String email = rs.getString(3);
//				String phone = rs.getString(4);
//				String userU = rs.getString(5);
//				String passU = rs.getString(6);
//				
//				//customer c = new customer(id,name,email,phone,userU,passU);
//				//cus.add(c);
//			}
//			
			if(result.next()) {
				success = true ; 
			}else {		
				success = false ;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
			return success;
		
	}
	
	
	
	
	public static List<Sttaf> checkPosition(String email, String password) {
		 
		ArrayList<Sttaf> stf= new ArrayList<>();
		//position variable true = admin if false = manager
		//boolean position = false;
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "select * from employee where email = '"+email+"' and password = '"+password+"' ";
			
			rs = stmt.executeQuery(sql);
			//ResultSet result = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email1 = rs.getString(3);
				String phone = rs.getString(4);
				String pass1 = rs.getString(5);
				String pos = rs.getString(6);
				
				Sttaf s = new Sttaf(id, name,email1, phone,pass1, pos);
				stf.add(s);
				
			}
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return stf;
	}
	
	
	
	
}
