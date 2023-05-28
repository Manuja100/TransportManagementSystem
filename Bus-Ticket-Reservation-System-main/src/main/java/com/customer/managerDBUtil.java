package com.customer;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.admin.Manager;



   public class managerDBUtil {
        
    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    
    public static boolean validate(String email, String password) {
        
try {
            
            con = DBcon.getConnection();
            stmt = con.createStatement();
            
            
            String sql = "select * from manager where email= '"+email+"' and password= '"+password+"' ";
            
            rs = stmt.executeQuery(sql);
            
            if(rs.next()) {
                
                isSuccess = true;
            }
            
            else {
                
                isSuccess =false;
            }
            
            
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return isSuccess;
        
        
        
        
    }
    
    public static List<Manager> getCusDetails(String email, String password ) {
        
        ArrayList<Manager> cus = new ArrayList<>();
        
        //validate
        try {
            
            con = DBcon.getConnection();
            stmt = con.createStatement();
            
            
            String sql = "select* from Manager where username = '"+email+"' and password = '"+password+"' ";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String emailU = rs.getString(3);
                String phone = rs.getString(4);
                String userU = rs.getString(5);
                String passU = rs.getString(6);
                
                Manager c = new Manager(id,name,emailU,phone,userU,passU);
                cus.add(c);
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        return cus;
        
    }
    
    public static boolean insertcustomer( String name , String email , String phone , String username , String password  ) {
        
        boolean isSuccess = false;
        
        
        
        try {
            
            con = DBcon.getConnection();
            stmt = con.createStatement();
            
            String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
            
            int rs1 = stmt.executeUpdate(sql);
            
            if(rs1 > 0) {
                isSuccess = true;
            }else {
                isSuccess = false;
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return isSuccess;
        
    }
    
    public static boolean updatecustomer(String id, String name, String email, String phone, String username, String password) {
        
        try {
            
            con = DBcon.getConnection();
            stmt = con.createStatement();
            String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+password+"',password='"+password+"'"
                    + "where id='"+id+"'";
            
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
    





}