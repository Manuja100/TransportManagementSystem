<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	
	<title>Customer registration</title>

	<link rel="stylesheet" href="CSS/customerRegistration.css">

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

	<meta name="viewport" content="width=device-width, initial-scale=1">

	<meta charset="UTF-8">

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">


</head>
<body>
	 <div class="wrapper">
    <h2>Customer - Registration</h2>
    
    <form action="register" method = "post">
    
          <div class="input-box">
            <input type="text" placeholder="Enter your first name" required name = "fName">
          </div>
          <div class="input-box">
            <input type="text" placeholder="Enter your last name" required name = "lName">
          </div>
            
          <div class="input-box">
            <input type="text" placeholder="Enter your email" required name = "email">
          </div>
            <div class="input-box">
            <input type="text" placeholder="Enter your Username" required name = "username">
          </div>
          <div class="input-box">
            <input type="text" placeholder="Enter your phone number" required name = "phoneNum" pattern="[0-9]{10}">
          </div>
          <div class="input-box">
            <input type="password" placeholder="Create password" required name = "password">
          </div>
          
          
          <select name="" id="">
            <option value="">Where was your birthplace</option>
          </select>
          <div class="input-box">
            <input type="text" placeholder="Security Question Answer" required name = "security">
          </div>
          
          
          
          <br>
          
      
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
            <li><a  href="FAQ.html">FAQ</a></li>
        </ul>



       <p class="para5">ⓒ2022 TravelMate Bookings | All Rights Reserved</p>



       <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>



  </footer>
</div>
</body>
</html>