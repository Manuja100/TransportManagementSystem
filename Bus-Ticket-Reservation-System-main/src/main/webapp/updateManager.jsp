<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Manager</title>
<link rel="stylesheet" href="/busBooking/css/updatecustomer.css">

</head>
<body>  

	 <%
        String emid = request.getParameter("empid");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("pss");
        String position = request.getParameter("pos");
    %>
    
    <div class="wrapper">
    <h2>Manager Registration</h2>
    
    <form action="updateManager" method="post">
          <div class="input-box">
            Customer ID<input type="text" name="empid" value="<%= emid%>" readonly>
          </div>
          <div class="input-box">
            Name<input type="text" name="name" value="<%= name%>">
          </div>
          <div class="input-box">
            Email<input type="text" name="email" value="<%= email%>">
          </div>
          <div class="input-box">
            Phone number<input type="text" name="phone" value="<%= phone%>">
          </div>
          <div class="input-box">
            Password<input type="text" name="psw" value="<%= password%>">
          </div>
          <div class="input-box">
            Position<input type="text" name="posi" value="<%= position%>" readonly>
          </div>
      
      <div class="input-box button">
        <input type="Submit" name="submit" value="Update Manager Data">
      </div>
      
    </form>
  </div>

</body>
</html>