package com.customer;

import java.lang.invoke.StringConcatFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean customerRegister(String firstName,String lastName,String email,String username,String phone,String pass,String confPass) {
		
		
		
		//initialize the return variable
		boolean success = false ; 
		
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			String sql = "INSERT INTO customer values (0,'"+firstName+"','"+lastName+"','"+email+"','"+username+"','"+phone+"','"+pass+"','"+confPass+"')";
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
	
	
	public static boolean updateCustomer(String id , String firstName , String lastName , String email , String username , String password , String phone ,  String sequrityQuestion) {
		
		boolean success = false; 
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			String sql = "UPDATE customer SET firstName = '"+firstName+"' , lastName = '"+lastName+"' , email = '"+email+"' , username = '"+username+"' , password = '"+password+"' , phoneNum = '"+phone+"' , securityQuestion = '"+sequrityQuestion+"'  WHERE cusID = '"+id+"'   ";
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				success = true ; 
			}else {		
				success = false ;
			}
				
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		return success;
		
		
	}
	
	
	public static List<customer> getCustomerDetails(String email){
		
		ArrayList<customer> cus = new ArrayList<>();
		
		
		
		
		
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			String sql = "SELECT * FROM customer WHERE email='"+email+"'" ;
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				int Id = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String email2 = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				String phoneNum = rs.getString(7);
				String securityQuestion = rs.getString(8);
				
				customer c = new customer(Id, firstName, lastName, email2, username, password, phoneNum, securityQuestion);
				cus.add(c);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return cus ; 
	}
	
	
	
public static boolean validate(String email, String password ) {
		
	
	  	boolean success = false ; 
		//ArrayList<customer> cus = new ArrayList<>();
		
		//validate
		try {
			
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
			
			String sql = "select * from customer where email= '"+email+"' and password= '"+password+"' ";
			
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
	

public static List<customer> sessionInfo(String email, String password ) {
	
	ArrayList<customer> cus1 = new ArrayList<>();
	
	//validate
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		
		
		String sql = "select * from customer where email= '"+email+"' and password= '"+password+"' ";
		
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString(3);
			String email1 = rs.getString(4);
			String user = rs.getString(5);
			String pass = rs.getString(6);
			String phoneNum = rs.getString(7);
			String sequrityQuestion = rs.getString(8);
			
			customer c = new customer(id, firstName, lastName, email1, user, pass, phoneNum, sequrityQuestion);
			cus1.add(c);
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus1;
	
}


public static boolean deleteCustomer(String email) {
	
	boolean success = false; 
	
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		
		String sql1 = "DELETE FROM customer where email ='"+email+"' ";
		int result = stmt.executeUpdate(sql1);
		
		if(result > 0) {
			success = true ; 
		}else {		
			success = false ;
		}
			
		
		
	}catch (Exception e) {
		
		e.printStackTrace();
		
	}
	
	
	return success;
	
	
}


public static List<customerBookingView> selectRoute(String from, String to) {
	
	ArrayList <customerBookingView> booking = new ArrayList<>();
	
	
	
	
	
try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		
		String sql = "SELECT * FROM customerbookingview WHERE start_point = '"+from+"' and destination = '"+to+"' ";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			String regNo = rs.getString(1);
			String departure_time = rs.getString(2);
			String arrival_time = rs.getString(3);
			String start_point = rs.getString(4);
			String destination = rs.getString(5);
			String type = rs.getString(6);
			String service = rs.getString(7);
			String price = rs.getString(8);
			String status = rs.getString(9);

			customerBookingView v = new customerBookingView(regNo, departure_time, arrival_time, start_point, destination, type, service, price, status);
			booking.add(v);
		}
			
		
		
	}catch (Exception e) {
		
		e.printStackTrace();
		
	}
	
	
	return booking ;
	
	
}
	


public static boolean validateRoute(String from, String to ) {
	
	
  	boolean success = false ; 
	//ArrayList<customer> cus = new ArrayList<>();
	
	//validate
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		
		
		String sql = "select * from customerbookingview where start_point= '"+from+"' and destination= '"+to+"' ";
		
		ResultSet result = stmt.executeQuery(sql);
		
//		while(rs.next()) {
//			int id = rs.getInt(1);
//			String name = rs.getString(2);
//			String email = rs.getString(3);
//			String phone = rs.getString(4);
//			String userU = rs.getString(5);
//			String passU = rs.getString(6);
//			
//			//customer c = new customer(id,name,email,phone,userU,passU);
//			//cus.add(c);
//		}
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



public static boolean insertBooking(int id, String date,int amount, int timetableID) {
	
	
	
	
	//initialize the return variable
	boolean success = false ; 
	
	
	try {
		
		con = DBcon.getConnection();
		stmt = con.createStatement();
		
		String sql = "INSERT INTO booking values (0,'"+id+"','"+date+"','"+amount+"','"+timetableID+"')";
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

	
	
}