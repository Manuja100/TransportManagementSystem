package com.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBcon;



public class DriverDBUtil {
	
	private static Connection conn = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean insertDriver(String name, String dob, String email, String NIC , String phone ,String password) {
		
		boolean isSuccess=false;
		
		try {
			
			conn =DBcon.getConnection();
			stmt = conn.createStatement();
			String sql = "insert into driver(name, dob, email, NIC , phone ,password) values('"+name+"','"+dob+"','"+email+"','"+NIC+"','"+phone+"','"+password+"') ";
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess=true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return isSuccess;
		
	}
public static boolean updateDriver(String name, String dob, String email, String phone ,String password,String nic) {
	
	boolean isSuccess=false;
	
	try {
		
		conn = DBcon.getConnection();
		stmt = conn.createStatement();
		String sql = "update driver set name='"+name+"',dob='"+dob+"',email='"+email+"',phone='"+phone+"',password='"+password+"' where NIC ='"+nic+"' ";
		int rs = stmt.executeUpdate(sql);
		
		
		System.out.println(name+dob+email);
		if (rs>0) {
			isSuccess=true;
		}
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
	return isSuccess;
	
}
public static boolean deleteDriver( String NIC ) {
	
	boolean isSuccess=false;
	
	try {
		
		conn = DBcon.getConnection();
		stmt = conn.createStatement();
		String sql = "delete  from driver where NIC ='"+NIC+"'";
		int rs = stmt.executeUpdate(sql);
		
		
		System.out.println("NIC");
		
		if (rs>0) {
			isSuccess=true;
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	
	return isSuccess;
	
}
	public static ArrayList<String >showDetails(String NIC){

		ArrayList <String> show = new ArrayList<>();		
		try {
			
			conn = DBcon.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from driver where NIC ='"+NIC+"'";
			ResultSet rs = stmt.executeQuery(sql);
						
			
			if(rs.next()) {
							
			String id = rs.getString(1);
			String name = rs.getString(2);
			String dob = rs.getString(3);
			String email = rs.getString(4);
			String NIC1 = rs.getString(5);
			String phone = rs.getString(6);
			String password = rs.getString(7);
			
			show.add(id);
			show.add(name);
			show.add(dob);
			show.add(email);
			show.add(NIC1);
			show.add(phone);
			show.add(password);
			
			
			}
			
		//	System.out.println(NIC);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return show;
	}
	
	public static List <DriverSalary>showSalary(String  NIC ){
		
		ArrayList <DriverSalary> show = new ArrayList<>();
		
		
		try {
			
			conn = DBcon.getConnection();
			stmt = conn.createStatement();
			
			String sql = "select * from salary where NIC = "+NIC+" ";
			ResultSet rs = stmt.executeQuery(sql);
			  
			
			
			while(rs.next()) {
				System.out.println(rs);
				
				int  sal_id = rs.getInt(1);
				String sal_date = rs.getString(2);
				String sal_amount = rs.getString(3);
				int driver_id = rs.getInt(4);
				
				
				DriverSalary ds = new DriverSalary(sal_id,sal_date,sal_amount,driver_id);
				
				show.add(ds);
				System.out.println(ds);
			}
				
		}
		catch(Exception e) {
			System.out.println(e);
		}		
		return show;
	}

}
