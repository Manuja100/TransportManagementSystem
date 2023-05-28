<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
		<link rel="stylesheet"  type="text/css"  href ="CSS/view.css">
</head>
<body>

		<%
			String id = request.getParameter("id");
			String regno = request.getParameter("Regno");
			String seat = request.getParameter("seat");
			String type = request.getParameter("type");
			
		%>
		
			<div class="container">
			<div class = "container-5">
			<form action="update" method="post" class="form-container">
				
					
					<label for="Regno"><b>Bus ID</b></label>
					<input type="text" name="busid" value="<%= id %>" readonly>
					
					<label for="Regno"><b>Registration Number</b></label>
					<input type="text" name="Regno" pattern="[A-Z]+[A-Z]+[0-9]{4}" value="<%= regno %>">
				
					<label for="Regno"><b>Seat</b></label>
					<input type="text" name="Seat" value="<%= seat %>">
				
					<label for="Regno"><b>Type</b></label>
					<input type="text" name="Type" value="<%= type %>">
				
						
				
				
				<br>
				<input class="submit" type="submit" name="submit" value="Update Data">
		</form>
		</div>
		</div>
		
		
</body>
</html>