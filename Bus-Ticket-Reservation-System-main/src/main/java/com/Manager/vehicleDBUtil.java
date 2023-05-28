package com.Manager;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBcon;






public class vehicleDBUtil {
	
	private static boolean success ;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rslt = null;

	
	
	public static boolean validate(String Regno){
		
		
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql ="select* from vehicle where regNo ='"+Regno+"'";
			rslt = stmt.executeQuery(sql);
			
			
			if(rslt.next()) {
				
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
	
	
	 
	
	public static boolean insertVehicle(String regno, String type, String seat, String ac, String wifi, String cctv, String mp3, String mp4) {
		
		boolean success = false;
		
		if (wifi == null) {
			
			wifi = "\s ";
		}
		
		if (cctv == null) {
			
			cctv = "\s ";
		}
		
		if (mp3 == null) {
			
			mp3 = "\s ";
		}
		
		if (mp4 == null) {
			
			mp4 = " \s";
		}
		
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "insert into vehicle values (0,'"+regno+"','"+seat+"','"+type+"',('"+ac+"''"+wifi+"''"+cctv+"''"+mp3+"''"+mp4+"'))";
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
	
	
	
	public static List<vehicle> getVehicleDetails(String regno){
		
		ArrayList<vehicle> bus = new ArrayList<vehicle>();
		
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql ="select* from vehicle where regNo ='"+regno+"'";
			rslt = stmt.executeQuery(sql);
			
			
			while(rslt.next()) {
				
				int id = rslt.getInt(1);
				String Regno = rslt.getString(2);
				String seat = rslt.getString(3);
				String type = rslt.getString(4);
				
				vehicle vhi = new vehicle(id,Regno,seat,type);
				bus.add(vhi);
			}
			
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return bus;
	}
	
	
	
	public static boolean updateVehicle(String id, String regno, String route, String seat, String type) {
		
		boolean success = false;
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "update vehicle set regNo ='"+regno+"',noOfSeats='"+seat+"', type='"+type+"'"
					+ " where busId = '"+id+"' ";
			
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
	
	public static boolean deleteVehicle(String regNo) {
		
		boolean success = false;
		
		
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "delete from vehicle where regNo = '"+regNo+"' ";
			int rs = stmt.executeUpdate(sql);
			
			if(rs >0){
				success = true;
			}
			else{
				success = false;
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return success;
		
	}

}
