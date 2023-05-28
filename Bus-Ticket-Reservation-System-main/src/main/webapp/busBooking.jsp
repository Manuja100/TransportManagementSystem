<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/busBooking.css">
<title>Booking</title>
</head>
<body>
<br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        
		<!--
		<c:set var = "regNo" value ="${book.regNo}"/>
		<c:set var = "departure_time" value ="${book.departure_time}"/>
		<c:set var = "arrival_time" value ="${book.arrival_time}"/>
		<c:set var = "start_point" value ="${book.start_point}"/>
		<c:set var = "destination" value ="${book.destination}"/>
		<c:set var = "type" value ="${book.type}"/>
		<c:set var = "service" value ="${book.service}"/>
		
		<c:set var = "status" value ="${book.status}"/> -->
		
		

        <div class="table-wrapper">
            <table class="table_booking" id="table_booking_id">
                <thead>
                <tr>
                    <th>Registration Number</th>
                    <th>Departure Time</th>
                    <th>Arrival time</th>
                    <th>From</th>
                    <th>To</th>
                    <th>Bus Type</th>
                    <th>Services</th>
                    <th>Price</th>
                    <th>Availability</th>
                    <th>Select no of seats</th>
                    <th>Book</th>
                </tr>
                </thead>
                <c:forEach var="book" items="${bookingDetails}">
                <c:set var = "price" value ="${book.price}"/>
                    <tr>
                      <td>${book.regNo}</td>
                      <td>${book.departure_time}</td>
                      <td>${book.arrival_time}</td>
                      <td>${book.start_point}</td>
                      <td>${book.destination}</td>
                      <td>${book.type}</td>
                      <td>${book.service}</td>
                      <td>${book.price}</td>
                      <td>${book.status}</td>
                  <!--    <td>
                     
                     <div class="selectSeats">
            <label for="seats" class="label">Select number of seats</label><br>
            <select name="seats" id="" class="selectNumberOfSeats">
            
            
            
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              
              
              
            </select>
            
           
            
          </div></td>--> 
                      
                      
                       <c:url value = "paymentPage.jsp" var="price">
                        
                        	<c:param name = "price" value = "${price}"/>
                        	<c:param name = "noOfSeats" value = "${seats}"/>
                        	
                        </c:url>
                      
                      <td>
                      <a href = "${price}">
                      
        						<button type="">Book Seats</button>
                        
                        
                       
                        </a></td> <!-- delete button -->
        					
                      
        
                      
                    </tr>
                    </c:forEach>
            </table>
            
        </div>

</body>
</html>