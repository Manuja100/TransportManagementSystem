<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Driver - Login</title>
<link rel="stylesheet" href="CSS/login.css">
</head>
<body>

	<div class="wrapper">
	<h1>Driver Login</h1>
    <form action="driverLogin" method="post">
          <div class="input-box">
            <input type="text" name="uid" placeholder="Enter NIC" required pattern = "[0-9]{9}">
          </div>
          <div class="input-box">  
            <input type="password" name="pass" placeholder="Enter Password" required>
          </div>
          
      
      <div class="input-box button">
        <input type="Submit" value="Login Now">
      </div>
      
    </form>
    
    </div>
   	

</body>
</html>