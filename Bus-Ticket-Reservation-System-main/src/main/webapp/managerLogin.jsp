<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrapper">
	
    <form action="cusLogin" method="post">
          <div class="input-box">
            <input type="text" name="uid" placeholder="Enter Email" required>
          </div>
          <div class="input-box">  
            <input type="password" name="pass" placeholder="Enter password" required>
          </div>
          
      
      <div class="input-box button">
        <input type="Submit" value="Login Now">
      </div>
      
    </form>
    
    </div>
</body>
</html>