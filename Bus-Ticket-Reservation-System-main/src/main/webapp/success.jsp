<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ page import = "java.sql.*" %>

<% ResultSet rs = null ; %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Success </h1>
	<%   
			HttpSession session2 = request.getSession();
			session2.getAttribute("user");  

			%> 

	
			<%! String driverName = "com.mysql.jdbc.Driver";  %>
			<%! String url = "jdbc:mysql://localhost:3306/busdb"; %>
			<%! String user = "root"; %>
			<%! String password_db = "21323966"; %>
			<% Connection con; %>
				
			<% 	
				Class.forName(driverName);
				con = DriverManager.getConnection(url,user,password_db);
				String sql = "SELECT * FROM customer WHERE email = '"+session2.getAttribute("user")+"'";
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
			%>	
			
			<h1>Welcome <% while(rs.next()){ %> <%= rs.getString(2)%> <% } %> </h1>
			
			
</body>
</html>