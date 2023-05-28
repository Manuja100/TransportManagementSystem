<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>  

<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%> 
<%@page import="com.customer.DBcon"%> 

<% ResultSet rs = null ; %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <title>DriverView</title>
    
<style>
  
  body{
  background: linear-gradient(to right, #3A7CA5,#81C3D7,#D9DCD6);
  overflow: auto;
  font-family: arial; 
}
  
h1 {
  text-align: center;
  padding: 12px;
  font-size: 44px;
  text-transform: uppercase;
  color: #030100 ;
}
.button1 {
  background-color: #030100 ;
  border: none;
  color: white;
  padding: 10px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 10px;
  margin: 4px 2px;
  cursor: pointer;
}


.content-table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 1em;
  min-width: 500px;
  border-radius: 3px 3px 0 0;
  overflow: hidden;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}

.content-table thead tr {
  background-color:#5D6D7E;
  color:  rgba(93, 109, 126);
   text-align: left;
  font-weight: bold;
}

.content-table th,
.content-table td {
  padding: 14px 18px;
  color:#030100;
}

.content-table tbody tr {
  border-bottom: 5px solid #030100;
}

.content-table tbody tr:nth-of-type(even) {
  background-color: #5D6D7E;
}

.content-table tbody tr:last-of-type {
  border-bottom: 2px solid #5D6D7E;
}

.content-table tbody tr.active-row {
  font-weight: bold;
  color: #5D6D7E
}

</style> 
 
 <title>Drivers Details</title>
 
</head>
<body>

<h1>Driver Register Details</h1>

<div class="">
  
			
			 

			 

	
			<%! String driverName = "com.mysql.jdbc.Driver";  %>
			<%! String url = "jdbc:mysql://localhost:3306/busdb"; %>
			<%! String user = "root"; %>
			<%! String password_db = "21323966"; %>
			<% Connection con; %>
				
			<% 	
				Class.forName(driverName);
				con = DriverManager.getConnection(url,user,password_db);
				String sql = "SELECT * FROM driver WHERE NIC= '"+session.getAttribute("user")+"'";
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
			%>	


	
							
							<table id="mytable" class="content-table">
								 
								<thead>
								 <th scope="col">Driver id</th>
								 <th scope="col">Driver name</th>
								 <th scope="col">Driver DOB</th>
								 <th scope="col">Driver Email</th>
								 <th scope="col">Driver NIC</th>
								 <th scope="col">phone number</th>
								  <th scope="col">password</th>
								   							  
									<th>Update</th>
									
									 <th>Delete</th>
							 </thead>
				  <tbody>	
			   
				    
				  <tr>
				  
				    <td><% while(rs.next()){ %> <%= rs.getString(1)%> </td>
				    <td><%= rs.getString(2)%>  </td>
				    <td> <%= rs.getString(3)%> </td>
				    <td> <%= rs.getString(4)%> </td>
				    <td> <%= rs.getString(5)%> </td>
				    <td> <%= rs.getString(6)%> </td>
				    <td><%= rs.getString(7)%><% } %></td>
				    
				  
				  
				   <td><a href="DriverUpdate.jsp">
				   <button class="button1" data-title="Edit" data-toggle="modal" data-target="#edit" >
				   <span class="fas fa-trash-alt"></span></button></a></td>
				 
				  <td><a href="DriverDelete.jsp">
				  <button class="button1" data-title="Delete" data-toggle="modal" data-target="#delete" >
				  <span class="fas fa-trash-alt"></span></button></a></td>
				  
				  </tr>
				  
				  </tbody>
				  			  
			  </table>
				
		</div>


</body>
</html>