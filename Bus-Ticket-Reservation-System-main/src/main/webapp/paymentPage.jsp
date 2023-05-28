<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import = "java.sql.*" %>

<% ResultSet rs = null ; %>   
    
<!DOCTYPE html>
<html>
<head>

        <link rel="stylesheet" href="CSS/seatSelect.css">

        

        <link rel="icon" href="Images/logo.png">


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

         
          
          
           <%
            	
            	int price = Integer.parseInt(request.getParameter("price"));
            	
            	
            %>
            
          
        <form name="payment" action="" method="post">  
            
            <br>
            <br>
            
           
            
            
            	<label for = "ammount" class="ammountLabel">You have to pay</label>
            	 <input type="text" placeholder="Name on card" required value = "<%= price%>" id="price">
            	
            
          
            
            
            
            
            
            
             
            

          <h1>Checkout</h1>

          <input type="text" placeholder="Card number" required name="cardNumber">

          <input type="text" placeholder="Name on card" required value = "" >

          <input type="text" placeholder="MM/YY" required>

          <input type="text" placeholder="CVC" required>

          <button type="submit" class="button" onclick=""> <span>Pay Now </span></button>

        </form>

        <script>
        
			
		
	
	</script>
</body>
</html>