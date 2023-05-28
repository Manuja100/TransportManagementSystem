<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manager Insert page</title>
	
	<link rel="stylesheet" href="CSS/login.css">
</head>
<body>

	 <div class="wrapper">
    <h2>Manager Details Insert</h2>
    
    <form action="insertNewManager" method="post">
          <div class="input-box">
            <input type="text" name="name" placeholder="Enter your name" required>
          </div>
            <div class="input-box">
            <input type="text" name="email" placeholder="Enter your email" required>
          </div>
          <div class="input-box">
            <input type="text" name="phone" placeholder="Enter your phone" required>
          </div>
           <!--  <div class="input-box">
            <input type="text" name="uname" placeholder="Enter your user name" required>
          </div>-->
          <div class="input-box">
            <input type="text" name="psw" placeholder="Enter your password" required>
          </div>
      
      <div class="input-box button">
        <input type="Submit" value="Create New manager Profile">
      </div>
      
      
    </form>
  </div>

</body>
</html>