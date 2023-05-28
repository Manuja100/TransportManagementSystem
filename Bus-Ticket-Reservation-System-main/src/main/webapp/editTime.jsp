<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	
		<meta charset="UTF-8">
		<title>view</title>
		<link rel="stylesheet"  type="text/css"  href ="CSS/TimeTable.css">
		<script src = "JS/Manager.js"> </script>
</head>
<body>

	<div class="container">
		<div class = "container-1" id="section2">
		<form action = "updateTime" method = "post" class="form-1">
		<table id = "customers">
		
		
		
		<tr>
				 <th> <label>Time id</label></th>
			    <th> <label>Bus No</label></th>
			    <th><label>Route ID</label></th>
			    <th><label>Start time</label></th>
			    <th><label>Off time</label></th>
			    <th><label>Status</label></th>
			    <th><label>Date</label></th>
			    <th><label>Price</label></th>
			    
		 </tr>
		<c:forEach var="time" items="${timeDetails}">
		
			<c:set var="id" value="${time.timeid }"/>
			<c:set var="id" value="${time.busid }"/>
			<c:set var="route" value="${time.routeId }"/>
			<c:set var="start" value="${time.start }"/>
			<c:set var="reach" value="${time.reach }"/>
			<c:set var="date" value="${time.date }"/>
			<c:set var="status" value="${time.status }"/>
			<c:set var="status" value="${time.price }"/>
			
			
			  
			 
			 	<tr>
			 	
			 	<td> <input type="text" name="tid" value ="${time.timeid }" readonly> </td>
			    <td> <input type="text" name="busno" value ="${time.busid }" readonly> </td>
			    <td> <input type="text" name="routeId" value ="${time.routeId }" readonly></td>
			    <td> <input type="text" name="start" value ="${time.start }"></td>
			    <td> <input type="text" name="reach" value ="${time.reach}"></td>
			    <td> <input type="text" name="date" value ="${time.date }" ></td>
			    <td> <input type="text" name="status" value ="${time.status }"></td>
			     <td> <input type="text" name="price" value ="${time.price }"></td>
			   
			    
			  </tr>
			  
	</c:forEach>  

	</table>	
	
	<br><br>

	<input  class ="submit" type="submit" name="submit" value="Edit"> 
	<a href="#section1"><input  class ="cancel" type="button" name="delete" value="Delete"  onclick="openForm()"> </a>
		
	</form>	
		
	</div>
	
	<div class="container-2">
	
	<div class="form-popup" id="myForm" >
               <form action="deleteTime" method="post" class="form-container" id="section1">
                        <h1>Delete</h1>
                      
                         <label for="id"><b>Table ID</b></label>
                         <input type="text" placeholder="Enter ID" name="tid"  required>
                      
                      
                          <button type="submit" class="submit-1">Delete</button><br><br>
                          <a href = "#section2"><button type="button" class="cancel-1" onclick="closeForm()" >Close</button></a>
                </form>
         </div>
	
	</div>
</div>	
	

</body>
</html>