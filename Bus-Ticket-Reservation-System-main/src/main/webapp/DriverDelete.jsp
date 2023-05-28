
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="CSS/s1.css"rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

<style>
		body{
		  background-image:url('Images/delete.jpg');
		   background-size:     cover;    
		  background-repeat: no-repeat;
		   overflow: auto;
		}
		.wrapper h2{
		  position: relative;
		  font-size: 28px;
		  font-weight: 600;
		  color: #FFFFFF;
		}
		
		
		footer {
		    margin-left: -3%;
		    position: relative;
		    width: 96.40%;
		    background: #16425B;
		    min-height: 100px;
		    padding: 20px 50px;
		    display: flex;
		    justify-content: center;
		    align-items: center;
		    flex-direction: column;
		    margin-top: 235px;
			float : cancel;
		}
</style>
</head>
<body>

			<%   
			
			HttpSession session3 = request.getSession();
			session3.getAttribute("user");  

			%> 

<div class="wrapper1">
<div class="wrapper">

<form method ="post" action = "deleteDriver">
<input type ="hidden" value ="${user}"  name="NIC">

<h2>Conform your delete</h2>  
      <div class="input-box button">
        <input type="Submit" value="Delete Now">
      </div>

</form>  	







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
   </div>

</body>
</html>