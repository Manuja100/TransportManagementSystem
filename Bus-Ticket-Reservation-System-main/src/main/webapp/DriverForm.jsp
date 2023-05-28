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
  background-image:url('IMG/reg.jpg');
  background-repeat: no-repeat;
  overflow: auto;
  backdrop-filter: blur(1px);
}

</style>
</head>
<body>
<div class="wrapper1">
<div class="wrapper">
    <h2>Registration</h2>
	
    <form action="insertDriver" method ="post">
    

		  <div class="input-box">
			<input type="text" placeholder="Enter your  name"name="name"  required>
		  </div>
		    <div class="input-box">
			<input type="date" placeholder="Enter your date of birth"name="dob"  required>
		  </div>
		  <div class="input-box">
			<input type="text" placeholder="Enter your email"name="email"  required>
		  </div>
		    <div class="input-box">
			<input type="text" placeholder="Enter your NIC"name="NIC"  required>
		  </div>
		  <div class="input-box">
			<input type="text" placeholder="Enter your phone number"name="phone"  required pattern="[0-9]{10}">
		  </div>
		  <div class="input-box">
			<input type="password" placeholder="Create password"name="password"  required>
		  </div>
		  
       <div class="policy">
        <input type="checkbox">
        <h3>I accept all terms & condition</h3>
      </div>
	  
      <div class="input-box button">
        <input type="Submit" value="Register Now">
      </div>
	  
      <div class="text">
        <h3>Already have an account? <a href="#">Login now</a></h3>
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