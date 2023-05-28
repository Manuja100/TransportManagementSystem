<%@page import="com.customer.DBcon"%>
<%@page import="com.customer.customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.sql.*" %>

<% ResultSet rs = null ; %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer profile</title>

 		<link rel="stylesheet" href="CSS/customerHome.css">
        <script type="text/javasript" src="JS/customerHome.js"></script>
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
	
				
			 


	  <div class="welcome_msg">

			<h1>Welcome <% while(rs.next()){ %> <%= rs.getString(2)%> <% } %> </h1>
			
             	
      </div>
        
        
        
        
        
            <form action = "view" method = "POST">
            	
            	<input type = "submit" class = "button2" value="profile"> 
            	
            </form>
    
    
    <form action = "logoutEND" method = "POST">
            <button class="button" type ="submit"> Logout</button>
     </form>


        <div class="route-selection">
            <h1>Select Route</h1>

        
            <form action="routeSelectBook" method = "POST">
                                    
                    <%
                    Connection con1 = null;
                    
                    try
					{
					Class.forName("com.mysql.jdbc.Driver");
					con1 = DriverManager.getConnection(url,user,password_db);
					String sql1 = "SELECT * FROM route";
					Statement stmt1 = con.createStatement();
					ResultSet rs1 = stmt.executeQuery(sql1);
					%>
					<h1>From</h1>
				<select name="from" required id="lang" class="select-route-dropdown">
				<option value="0">Select Route</option>
				<%
				   while(rs1.next()){ %>
				   
		            <option><%= rs1.getString(2)%></option>
		        <% } %>
			
				</select>
			
				<%
				}
				catch(SQLException e)
					{ 
					out.println(e);
					}
				%>
                
                
                 <%
                    Connection con2 = null;
                    
                    try
					{
					Class.forName("com.mysql.jdbc.Driver");
					con2 = DriverManager.getConnection(url,user,password_db);
					String sql1 = "SELECT * FROM route";
					Statement stmt1 = con.createStatement();
					ResultSet rs1 = stmt.executeQuery(sql1);
					%>
                <h1>To</h1>
                <select name="to" required id="lang" class="select-route-dropdown">
				<option value="0">Select Route</option>
				<%
				   while(rs1.next()){ %>
				   
		            <option><%= rs1.getString(3)%></option>
		        <% } %>
			
				</select><br><br>
			
				<%
				}
				catch(SQLException e)
					{ 
					out.println(e);
					}
				%>
                
                
               <!--  <input type ="hidden"  name = "route_info">    -->
     
                <input id = "submitRouteBtn" type="submit" value="Submit"/>
                
          </form>

										
										
									










        </div>
</body>
</html>