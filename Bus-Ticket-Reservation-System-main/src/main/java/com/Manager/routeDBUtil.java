package com.Manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBcon;

public class routeDBUtil {
	
	private static boolean success ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rslt = null;

	
	public static boolean insertRoute(String start, String dest ) {
		
		boolean success = false;
			
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "insert into route values (0,'"+start+"','"+dest+"')";
			int result = stmt.executeUpdate(sql);
				
				if(result > 0) {
					
					success = true;
				}
				
				else {
					success = false;
				}
				
		con.close();
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return success;
	} 
	
public static List<route> getrouteDrtails(){
		
		ArrayList<route> route = new ArrayList<route>();
		
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql ="select* from route";
			rslt = stmt.executeQuery(sql);
			
			
			while(rslt.next()) {
				
				String start = rslt.getString(2);
				String end = rslt.getString(3);
				
				route rt = new route(start,end);
				route.add(rt);
			}
			
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return route;
	}

}
