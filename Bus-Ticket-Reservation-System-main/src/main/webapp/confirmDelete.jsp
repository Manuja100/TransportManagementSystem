<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.sql.*" %>

<% ResultSet rs = null ; %>    
    
    
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="CSS/customerProfile.css">
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%! String driverName = "com.mysql.jdbc.Driver";  %>
			<%! String url = "jdbc:mysql://localhost:3306/busdb"; %>
			<%! String user = "root"; %>
			<%! String password_db = "21323966"; %>
			<% Connection con; %>
				
			<% 	
				Class.forName(driverName);
				con = DriverManager.getConnection(url,user,password_db);
				String sql = "SELECT * FROM customer WHERE email = '"+session.getAttribute("user")+"'";
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
			%>	

<div class="">
	<h1>Hello <% while(rs.next()){ %> <%= rs.getString(2)%> <% } %>  </h1>
	<h3>Are you sure you want to delete the account permenantly ? </h3>
	
	<form action = "deletecus" method = "POST">
	
        	<input type="Submit" value="Delete Account" class="delete_btn_profile">
        	
    </form>
 </div>   
	
</body>
</html>