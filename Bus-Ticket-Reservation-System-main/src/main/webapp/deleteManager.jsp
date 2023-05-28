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

	<%
        String email = request.getParameter("email");
  
    %>
    
    <div class="wrapper">
    <h2>Delete Manager</h2>
    
    <form action="DeleteManager" method="post">
          <div class="input-box">
            Manager Email<input type="text" name="email" value="<%= email%>" readonly>
          </div>  
      <br>
      <div class="input-box button">
        <input type="Submit" name="submit" value="Delete">
      </div>
      
    </form>
  </div>

</body>
</html>