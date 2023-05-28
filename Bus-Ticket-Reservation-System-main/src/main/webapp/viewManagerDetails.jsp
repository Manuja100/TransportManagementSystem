<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/login.css">
</head>
<body>

	<div class="wrapper">
    <h2>View Manager Form</h2>
    
    <form action="viewManager" method="post">
    
          <div class="input-box">
            Employee ID<input type="text" name="empid" value="empid" >
          </div>
          <br>
          <div class="input-box">
            Position<input type="text" name="pos" value="pos" pattern="[A-Z]+[a-zA-Z]*$">
          </div>
      <br>
      <div class="input-box button">
        <input type="Submit" name="submit" value="Submit">
      </div>
      
    </form>
  </div>

</body>
</html>