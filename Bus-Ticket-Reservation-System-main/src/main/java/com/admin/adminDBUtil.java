package com.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Manager.vehicle;
import com.customer.DBcon;

public class adminDBUtil {
	
	private static boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
public static boolean validate(int id ,String pos){
		
		
		
		try {
					
					con = DBcon.getConnection();
					stmt = con.createStatement();
					String sql ="select * from employee where empID ='"+id+"' and position='"+pos+"'";
					rs = stmt.executeQuery(sql);
					
					
					if(rs.next()) {
						
						isSuccess = true;
						
					}
					
					else {
						
						isSuccess = false;
					}
					
					
					
				}
				catch(Exception e) {
					
					e.printStackTrace();
					
				}
				
				return isSuccess;
			}
			
	
public static boolean insertManager(String name, String email, String phone, String password ) {
		
		
		
		//initialize the return variable
		boolean success = false ; 
		
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO employee values (0,'"+name+"','"+email+"','"+phone+"','"+password+"','Manager')";
			int result = stmt.executeUpdate(sql);
			
			
			if(result > 0) {
				success = true ; 
			}else {
				success = false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return success; 
		
		
	}


	public static boolean updateManager(String id, String name, String email, String phone, String password, String posi) {
    
    try {
        
        con = DBcon.getConnection();
        stmt = con.createStatement();
        String sql = "update employee set name='"+name+"',email='"+email+"',phone='"+phone+"',password='"+password+"',position='"+posi+"'"
                + "where empID='"+id+"'";
        
        int rs2 = stmt.executeUpdate(sql);
        
        if( rs2 > 0 ) {
            isSuccess = true;
        }else {
            isSuccess = false;
        }
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return isSuccess;
    
	}
	
public static List<Manager> getManagerDetails(int id,String pos){
		
		ArrayList<Manager> manager = new ArrayList<Manager>();
		
		
try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql ="select * from employee where empID = '"+id+"' and position ='"+pos+"'";
			ResultSet rs2 = stmt.executeQuery(sql);
			
			
			while(rs2.next()) {
				
				int empID= rs2.getInt(1);
				String name = rs2.getString(2);
				String email = rs2.getString(3);
				String phone = rs2.getString(4);
				String password = rs2.getString(5);
				String position = rs2.getString(6);
				
				
				Manager man = new Manager(empID,name, email, phone, password,position);
				manager.add(man);
			}
			
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return manager;
	}
	
	public static boolean deleteManager(String email) {
		boolean success = false;
		
		//int convertedID = Integer.parseInt(id);
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql = "delete from employee where email = '"+email+"'";
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
