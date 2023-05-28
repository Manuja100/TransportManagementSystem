<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet"  href ="CSS/Manager.css">
        <script src = "JS/Manager.js"> </script>
   </head>

    <body>
    
    <%! String driverName = "com.mysql.jdbc.Driver";%>
	<%!String url = "jdbc:mysql://localhost:3306/busdb";%>
	<%!String user = "root";%>
	<%!String psw = "21323966";%>
	 
	
	
   <div class="backgroundImageCVR">
   <!--  <div class="background-image"></div>-->
   
         <form action = "logoutEND" method = "POST">
            <button class="button1" type ="submit"> Logout</button>
     	</form>
        
       
            <div class="content">
                <div class="container-2" id = "section2">
                    <div class="row">
                        <div class="column">
                            <div class="container-4">
                            <div class="card">
                                <img src="Images/avatar.png" alt="Avatar"  class="image" style="width:100%">
                                <div class="middle">
                                    <div><a href="#section1"><button class="btn"  onclick="openForm()">View</button></a></div>
                                  </div>
                                <div class="container-3">
                                <h4><b>view vehicle Details</b></h4> 
                                </div> 
                            </div>
                            </div>
                        </div>

                        <div class="column">
                            <div class="container-4">
                            <div class="card">
                                <img src="Images/avatar.png" alt="Avatar" class="image" style="width:100%">
                                <div class="middle">
                                    <div><a href="#section3"><button class="btn"  onclick="openForm_3()">Add</button></a></div>
                                  </div>
                                  <div class="container-3">
                                    <h4><b>Add vehicle Details</b></h4>  
                                </div>
                            </div>
                            </div>
                        </div> 
                        
                        <div class="column">
                                <div class="container-4">
                                <div class="card">
                                    <img src="Images/avatar.png" alt="Avatar"  class="image" style="width:100%">
                                    <div class="middle">
                                        <div><a href="#section4"><button class="btn"  onclick="openForm_4()">Add</button></a></div>
                                    </div>
                                    <div class="container-3">
                                    <h4><b>Add route</b></h4> 
                                    </div>
                                </div>
                                </div>
                            </div>
                    </div>
                </div>
                
                 <div class="container-6" >
                	<div class= "row">
                		<div class="column">
                                <div class="container-4">
                                <div class="card">
                                    <img src="Images/avatar.png" alt="Avatar"  class="image" style="width:100%">
                                    <div class="middle">
                                        <div><a href="#section5"><button class="btn"  onclick="openForm_5()">Add</button></a></div>
                                    </div>
                                    <div class="container-3">
                                    <h4><b>Add Time</b></h4> 
                                    </div>
                                </div>
                                </div>
                            </div>
                            
                            <div class="column">
                                <div class="container-4">
                                <div class="card">
                                    <img src="Images/avatar.png" alt="Avatar"  class="image" style="width:100%">
                                    <div class="middle">
                                        <div><a href ="Edit?param1=cool"><button class="btn" >Add</button></a></div>
                                    </div>
                                    <div class="container-3">
                                    <h4><b>Edit Table</b></h4> 
                                    </div>
                                </div>
                                </div>
                            </div>
                            
                            
                    	</div>
                    </div>        
                      

                <div class="container-5" >
                    <div class="form-popup" id="myForm" >
                        <form action="viewVehicle" method="post" class="form-container" id="section1">
                          <h1>View</h1>
                      
                          <label for="email"><b>Registration Number</b></label>
                          <input type="text" placeholder="XX0000" name="Regno" pattern="[A-Z]+[A-Z]+[0-9]{4}" required>
                      
                      
                          <button type="submit" class="submit">view</button><br><br>
                          <a href = "#section2"><button type="button" class="cancel" onclick="closeForm()" >Close</button></a>
                        </form>
                      </div>
                

                        <div class="form-popup" id="myForm_3" >
                            <form action="insert"  method ="post" class="form-container" id="section3">
                            <h1>Add Vehicle Details</h1>
                        
                            <label for="Regno"><b>Registration Number</b></label>
                            <input type="text" placeholder="XX0000" name="Regno" pattern="[A-Z]+[A-Z]+[0-9]{4}" required>

									<label for="Route"><b>Route</b></label>
									
									<%
										Connection con = null;
										
									try
										{
										Class.forName("com.mysql.jdbc.Driver");
										con = DriverManager.getConnection(url,user,psw);
										String sql = "SELECT * FROM route";
										Statement stmt = con.createStatement();
										ResultSet rslt = stmt.executeQuery(sql);
										%>
									<select name="route" required>
									<option value="0">--Select Type--</option>
									<%
									   while(rslt.next()){ %>
									   
							            <option><%= rslt.getString(2)%>-<%= rslt.getString(3)%></option>
							        <% } %>
								
									</select><br><br>
									
								
									<%
									}
									catch(SQLException sqe)
										{ 
										out.println(sqe);
										}
									%>
								
                            
                            <label for="Tbus"><b>Type of the Bus</b></label>
                            <select name="bus" id="busses" style=" height: 4%;" required>
                                <option value="0">--Select Type--</option>
                                <option value="luxury">Luxury</option>
                                <option value="semiLuxury">Semi Luxury</option>
                              </select><br><br>
                            
                              <label for="Noseats"><b>Number of Seats</b></label>
                              <select name="seats" id="seats" style=" height: 4%;" required>
                                  <option value="0">--Select Seats--</option>
                                  <option value="52">80</option>
                                  <option value="80">52</option>
                                  <option value="64">64</option>
                                </select><br><br>
                               
                                
                                <label for="features"><b>Features</b></label><br>
		                            <input type="checkbox" id="F1" name="AC" value="AC" checked>
		                            <label for="F1"> AC</label>
		                            <input type="checkbox" id="F2" name="wifi" value="wifi">
		                            <label for="F2"> WIFI</label>
		                            <input type="checkbox" id="F3" name="cctv" value="cctv">
		                            <label for="F3"> CCTV</label><br><br>
		                            <input type="checkbox" id="F4" name="mp3" value="mp3">
		                            <label for="F4"> Mp3</label>
		                            <input type="checkbox" id="F5" name="mp4" value="mp4">
		                            <label for="F5"> Mp4</label><br><br><br>
		                               
                            <button type="submit" class="submit">Add</button><br><br>
                            <a href = "#section2"><button type="button" class="cancel" onclick="closeForm_3()">Close</button></a>
                           </form>
                        </div>

                        <div class="form-popup" id="myForm_4" >
                            <form action="add" method = "post" class="form-container" id="section4">
                            <h1>Add</h1>
                        
                            <label for="str"><b>Start </b></label>
                            <input type="text" placeholder="Enter Start Point" name="start"  pattern= "[A-Z]+[a-zA-Z]*$" required>

                            <label for="dest"><b>Destination </b></label>
                            <input type="text" placeholder="Enter Destination" name="dest"   pattern= "[A-Z]+[a-zA-Z]*$" required>

                            
                        
                            <button type="submit" class="submit">Add</button><br><br>
                            <a href = "#section2"><button type="button" class="cancel" onclick="closeForm_4()">Close</button></a>
                            </form>
                        </div>
                        
                        <div class="form-popup" id="myForm_5" >
                            <form action="AddTime"  method ="post" class="form-container" id="section5">
                            <h1>Add Trip Time</h1>
                        
                            <label for="busno"><b>Bus Number</b></label>
                            <%
										Connection con2 = null;
										
									try
										{
										Class.forName("com.mysql.jdbc.Driver");
										con = DriverManager.getConnection(url,user,psw);
										String sql = "SELECT * FROM  vehicle";
										Statement stmt = con.createStatement();;
										ResultSet rslt = stmt.executeQuery(sql);
										%>
									<select name = "busno"  required>
									<option value="0">--Select Type--</option>
									<%
									   while(rslt.next()){ %>
									   
							            <option><%= rslt.getInt(1)%></option>
							        <% } %>
								
									</select><br><br>
									
								
									<%
									}
									catch(SQLException sqe)
										{ 
										out.println(sqe);
										}
									%>
									
									<label for="routeno"><b>Route Number</b></label>
                            <%
										Connection con3 = null;
										
									try
										{
										Class.forName("com.mysql.jdbc.Driver");
										con = DriverManager.getConnection(url,user,psw);
										String sql = "SELECT * FROM route";
										Statement stmt = con.createStatement();;
										ResultSet rslt = stmt.executeQuery(sql);
										%>
									<select name = "rtno"  required>
									<option value="0">--Select Type--</option>
									<%
									   while(rslt.next()){ %>
									   
							            <option><%= rslt.getInt(1)%></option>
							        <% } %>
								
									</select><br><br>
									
								
									<%
									}
									catch(SQLException sqe)
										{ 
										out.println(sqe);
										}
									%>
									
									<label for="route"><b>Route Number</b></label>
                            <%
										Connection con5 = null;
										
									try
										{
										Class.forName("com.mysql.jdbc.Driver");
										con = DriverManager.getConnection(url,user,psw);
										String sql = "SELECT * FROM route";
										Statement stmt = con.createStatement();;
										ResultSet rslt = stmt.executeQuery(sql);
										%>
									<select name = "route" >
									<option value="0">--Select Type--</option>
									<%
									   while(rslt.next()){ %>
									   
							            <option><%= rslt.getInt(1)%>[<%= rslt.getString(2)%>-<%= rslt.getString(3)%>]</option>
							        <% } %>
								
									</select><br><br>
									
								
									<%
									}
									catch(SQLException sqe)
										{ 
										out.println(sqe);
										}
									%>
									
                              
                             <label for="strT"><b>Start time </b></label>
                            <input type="time" placeholder="Enter Start time" name="sTime" required><br><br>

                            <label for="destT"><b>Destination reach time </b></label>
                            <input type="time" placeholder="Enter reach time" name="destTime" required><br><br>
                            
                            <label for="status"><b>Status </b></label>
                            <input type="text" placeholder="Enter the status" name="status" pattern= "[A-Z]+[\sa-zA-Z]*$" required>
                            
                            <label for="str"><b>Date</b></label>
                            <input type="date" placeholder="Enter the date" name="dte" required><br>
                            
                            <label for="prise"><b>Price</b></label>
                            <input type="text" placeholder="Enter the Price" name="price" required>
                                         
                            <br><button type="submit" class="submit">Add</button><br><br>
                            <a href = "#section2"><button type="button" class="cancel" onclick="closeForm_5()">Close</button></a>
                         </form>

                    </div>
                </div>
          
       
</div>

        <!-- Footer -->

        <footer>

            <div class="Waves">
                <div class="wave" id="wave1"></div>
                <div class="wave" id="wave2"></div>
                <div class="wave" id="wave3"></div>
                <div class="wave" id="wave4"></div>
            </div>

            <ul class="social_icon">
                <li><a href="#"><ion-icon name="logo-facebook"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-twitter"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-linkedin"></ion-icon></a></li>
                <li><a href="#"><ion-icon name="logo-instagram"></ion-icon></a></li>
            </ul>

            <ul class="menu">
                <li><a  href="#">Home</a></li>
                <li><a  href="#">About</a></li>
                <li><a  href="#">Services</a></li>
                <li><a  href="#">Team</a></li>
                <li><a  href="#">Contact</a></li>
            </ul>

            <p class="para5">@2022 TravelMate Bookings | All Rights Reserved</p>

            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

        </footer>

    </body>
</html> 