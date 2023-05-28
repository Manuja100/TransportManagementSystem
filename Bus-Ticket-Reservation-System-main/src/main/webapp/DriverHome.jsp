<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CSS/driverui.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
	
		<style>
		.main{
		
		 margin-top: 250px;
		}
		

.profile-pic-div{
    height: 200px;
    width: 200px;
    position:  absolute;
    top: 45%;
    left: 40%;
    botom:15%
    transform: translate(-50%,-50%);
    border-radius: 50%;
    overflow: hidden;
    border: 1px solid grey;
}

#photo{
    height: 100%;
    width: 100%;
}

#file{
    display: none;
}

#uploadBtn{
    height: 40px;
    width: 100%;
    position: absolute;
    bottom: 0;
    left: 50%;
    transform: translateX(-50%);
    text-align: center;
    background: rgba(0, 0, 0, 0.7);
    color: wheat;
    line-height: 30px;
    font-family: sans-serif;
    font-size: 15px;
    cursor: pointer;
    display: none;
}
form{
  margin-top: 0px;
  margin-bottom: 10px;
  background-color: transparent;
  border: transparent;
  border-radius: 5px;
  padding:0px;
	
}
form:hover{
  background-color: transparent;
  color: transparent;
  transition: .5s;
  cursor: pointer;
 }  
form .button1{
	margin-left:90%;
	margin-top:20px;
}


}
			
		</style>
</head>


<body>
		<%   
			
			HttpSession session3 = request.getSession();
			session3.getAttribute("user");  

			%> 
<form action = "logoutEND" method = "POST">
            <button class="button1" type ="submit"> Logout</button>
     </form>
	<div class="wellcome">
	    <h1>WELLCOME !!</h1>
	<br>
	
<hr>

</div>


<div class="profile-pic-div">
  <img src="Images/image.jpg" id="photo">
  <input type="file" id="file">
  <label for="file" id="uploadBtn">Choose Photo</label>
</div>

<script src="JS/app.js"></script>
     

     <div class="main">
     
     	
     
     
			<div class="card">
			
			<div class="image">
			   <img src="Images/img.jfif">
			</div>
			
			<div class="title">
			 <h1>Edit Profile</h1>
			</div>
			
			
			
		
			
			<div class="des">
			
			
			
			<form method ="post" action ="viewDriver"> 
			
			<button>
				 <input type="hidden" name="NIC" value = "${user}"> 
				<input type="Submit" value="go">
			</button>
			</form> 
				  
			</div>
			</div>

	


					<div class="card">
					
					<div class="image">
					    <img src="Images/sal.jfif">
					</div>
					<div class="title">
						<h1>View salary</h1>
					</div>
					
					<div class="des">
					<form method ="post" action ="viewSalary">
					
					<button>
				  	    <%-- <input type="hidden" name="NIC" value = "${driver_id}"> --%>
				  	    <input type="hidden" name="NIC" value = "${user}"> <!--login session(NIC)  -->
						<input type="Submit" value="go">
					</button>	
					
					</form>
					
					</div>
					</div>
							<div class="card">
							
							<div class="image">
							   <img src="Images/comp.jpg">
							</div>
								<div class="title">
								<h1>Add complains</h1>
							</div>
							<div class="des">
		
					
					    <button>
					    <a href = "http://localhost:8086/OOP_Driver/html/complains.html">go</a>
					   </button>

							
							</div>
							</div>
							   
   
   <div class="ftr">
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

        <p class="para5">ⓒ2022 TravelMate Bookings | All Rights Reserved</p>

        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

    </footer>
</div>
   
</body>
</html>