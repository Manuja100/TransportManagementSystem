<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>  
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>  


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">  
    <meta name="description" content="">
    <meta name="author" content="templatemo">
    <link href="CSS/viwetable.css" rel="stylesheet">
    <title>salaryViwe</title>
    
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
				  color: #8a2be2;
				}
			.button1 {
				  background-color: #008b8b;
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
</style> 
 
 <title>Salary Details</title>
 
</head>
<body>

<h1>Driver Salary Details</h1>


<div class="">
	<center>
							
				<table id="mytable" class="content-table">
								 
								 <thead>
								 <th scope="col">Driver id</th>
								 <th scope="col">salary id</th>
								 <th scope="col">Date</th>
								 <th scope="col">Amount</th>
								 
					         </thead>
				  <tbody>	
			  		    
						 
							  <c:forEach var="s" items="${showSalary}">
							  <tr>
									<td>${s.driver_id}</td>
									<td>${s.sal_id}</td>
									
									<td>${s.sal_date}</td>
									<td>${s.sal_amount}</td>
		
				</tr>
							</c:forEach>
							  
							  
							  
	
				  </tbody>
				  			  
			  </table>
	</center>			
</div>
</div>
</div>
</div>
</div>

</body>
</html>