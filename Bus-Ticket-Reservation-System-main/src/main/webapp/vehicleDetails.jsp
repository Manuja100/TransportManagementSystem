 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
   
    
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>view</title>
		<link rel="stylesheet"  type="text/css"  href ="CSS/view.css">
		<link rel="stylesheet" type= "text/css" href = "CSS/TimeTable.css">
		<script src = "JS/Manager.js"> </script>
						

</head>
<body>
		<div class="container">
		<div class = "container-5">
		<form class="form-container">
		
			<c:forEach var="vehi" items="${vehiDetails}">
			
			<c:set var="id" value="${vehi.id}"/>
			<c:set var="regno" value="${vehi.regno}"/>
			<c:set var="seat" value="${vehi.seat}"/>
			<c:set var="type" value="${vehi.type}"/>
			
			
			
				<label for="Regno"><b>Bus ID</b></label>
				<input type="text" name="budid" value = "${vehi.id}" >
			
			
				<label for="Regno"><b>Registration Number</b></label>
				<input type="text" name="Regno" value = "${vehi.regno}">
			
				<label for="Regno"><b>Seat</b></label>
				<input type="text" name="seat" value = "${vehi.seat}">
			
				<label for="Regno"><b>Type</b></label>
				<input type="text" name="type" value = "${vehi.type}">
			
		
			</c:forEach>
			</form>
			
			<c:url value="updateVehicle.jsp"  var="vehiupdate">
			
				<c:param name="id" value="${id}"/>
				<c:param name="Regno" value="${regno}"/>
				<c:param name="seat" value="${seat}"/>
				<c:param name="type" value="${type}"/>
				
			</c:url>
			
			<a href ="${vehiupdate}">
				<input  class ="submit" type="button" name="update" value="Edit"> 
			</a>
			
				<a href="#section1"><input  class ="cancel-2" type="button" name="delete" value="Delete"  onclick="openForm()"> </a>
			
			
	
			<div class="form-popup" id="myForm" >
               <form action="deleteVehicle" method="post" class="form-container" id="section1">
                        <h1>Delete</h1>
                      
                         <label for="id"><b>RegNo</b></label>
                         <input type="text" placeholder="Enter Registration Number" name="regno"  value="${regno}" required>
                      
                      
                          <button type="submit" class="submit-1">Delete</button><br><br>
                          <a href = "#section2"><button type="button" class="cancel-1" onclick="closeForm()" >Close</button></a>
                </form>
         	</div>
	
		
	</div>
</div>

</body>
</html>