<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Start your development with Dorang landing page.">
    <meta name="author" content="Devcrud">
    <title>Admin Home</title>
    
    <link rel="stylesheet" href="CSS/admin_home.css">
</head>
<body>


<body data-spy="scroll" data-target=".navbar" data-offset="40" id="home" class="dark-theme">

    <div id="main07">
    <div class="container07">

    
    <form action = "logoutEND" method = "POST">
            <button class="button" type ="submit"> Logout</button>
     </form>



        <div class="card07 c01">
            <div class="content07">
                <h2>01</h2>
                <h3>Add Manager</h3>
                <a href="managerInsert.jsp">Read More</a>
            </div>
        </div>

        <div class="card07 c02">
            <div class="content07">
                <h2>02</h2>
                <h3>View Manager Details</h3>
                <a href="viewManagerDetails.jsp">Read More</a>
            </div>
        </div>

      

       

       

    </div>
    
    <script type="text/javascript" src="assets\js\vanilla-tilt.js"></script>
    <script>

        VanillaTilt.init(document.querySelector(".c01"), {
		max: 25,
		speed: 400
	});

        VanillaTilt.init(document.querySelector(".c02"), {
		max: 25,
		speed: 400
	});

        VanillaTilt.init(document.querySelector(".c03"), {
		max: 25,
		speed: 400
	});

        VanillaTilt.init(document.querySelector(".c04"), {
		max: 25,
		speed: 400
	});

        VanillaTilt.init(document.querySelector(".c05"), {
		max: 25,
		speed: 400
	});

        VanillaTilt.init(document.querySelector(".c06"), {
		max: 25,
		speed: 400
	});

    </script>
</body>
</html>