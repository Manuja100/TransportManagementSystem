package com.Manager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBcon;

public class TimeTableDBUtil {
	
	private static boolean success ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rslt = null;
	
	
	public static boolean AddTime(int busno, int Rtno,  String start, String reach,String date, String status, int price) {
		
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "insert into timetable values (0,'"+busno+"','"+Rtno+"','"+start+"','"+reach+"','"+date+"','"+status+"', '"+price+"')";
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
	
	
public static List<timeTable> gettime(String btn){
		
		ArrayList<timeTable> time = new ArrayList<>();
		
		
try {
			if(btn.equalsIgnoreCase("cool")) {
				
				con = DBcon.getConnection();
				stmt = con.createStatement();
				String sql ="select* from timetable";
				rslt = stmt.executeQuery(sql);
				
				
				while(rslt.next()) {
					
					int tid = rslt.getInt(1);
					int busid = rslt.getInt(2);
					int routeId = rslt.getInt(3);
					String start = rslt.getString(4);
					String reach = rslt.getString(5);
					String date = rslt.getString(6);
					String status= rslt.getString(7);
					int price = rslt.getInt(8);
					
					timeTable table = new timeTable(tid,busid ,routeId,start,reach,date,status,price);
					time.add(table);
				}
		
			
			}
			else {
				
				System.out.println("not fetched");
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return time;
	}



public static boolean updateTime(int tid,int id, int routeId, String start, String end, String date, String status , int price) {
	
	boolean success = false;
	
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		String sql = "update timetable set busID ='"+id+"', routeId = '"+routeId+"',  departureTime = '"+start+"' ,"
				+ "arrivalTime ='"+end+"',date = '"+date+"' ,status = '"+status+"', price ='"+price+"' where timetableID = '"+tid+"' ";
		
		int rs = stmt.executeUpdate(sql);
		
		if (rs > 0) {
			
			success = true;
		}
		
		else {
			
			success = false;
		}
		
	}
	catch(Exception e) {
		
		e.printStackTrace();
		
	}
	return success ;
	
}

public static boolean deleteTable(int id) {
	boolean success = false;
	
	
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		String sql = "delete from timetable where timetableID = '"+id+"'";
		int rs = stmt.executeUpdate(sql);
		
		if( rs >0 ) {
			
			success = true;
		}
		
		else {
			
			success = false;
		}
		
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	
	return success;
	
}


}
	


