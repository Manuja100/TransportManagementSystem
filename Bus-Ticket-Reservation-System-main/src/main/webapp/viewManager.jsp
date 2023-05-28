<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
        <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="updateMan" method = "post">
	
		<c:forEach var="manager" items="${manDetails}">
			
			<c:set var="id" value="${manager.empID}"/>
			<c:set var="name" value="${manager.name}"/>
			<c:set var="email" value="${manager.email}"/>
			<c:set var="phone" value="${manager.phone}"/>
			<c:set var="pass" value="${manager.password}"/>
			<c:set var="pos" value="${manager.position}"/>
			
			
			
				<label for="id"><b>employee ID</b></label>
				<input type="text" name="empid" value = "${manager.empID}" >
			
			
				<label for="name"><b>Name</b></label>
				<input type="text" name="name" value = "${manager.name}">
			
				<label for="email"><b>Seat</b></label>
				<input type="text" name="email" value = "${manager.email}">
			
				<label for="phone"><b>Type</b></label>
				<input type="text" name="phone" value = "${manager.phone}">
				
				<label for="pass"><b>Type</b></label>
				<input type="text" name="pss" value = "${manager.password}">
				
				<label for="pos"><b>Type</b></label>
				<input type="text" name="pos" value = "${manager.position}">
			
			<input type="submit" name="delete" value="Update"> 
		
			</c:forEach>
			
			</form>
			

			<c:url value="deleteManager.jsp"  var="mandelete">
			
			<c:param name="email" value="${email}"/>
				
			</c:url>
			
			<a href ="${mandelete}">
			
				<input type="button" name="delete" value="Delete"> 
			</a>
			
	
</body>
</html>