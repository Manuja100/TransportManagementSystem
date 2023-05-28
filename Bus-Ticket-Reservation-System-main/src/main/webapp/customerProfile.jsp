<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Profile</title>

        <link rel="stylesheet" href="CSS/customerProfile.css">
        
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">



</head>
<body>
<div class="container rounded bg-white mt-5 mb-5">

            <div class="row">
               
                <div class="col-md-5 border-right">
                    <div class="p-3 py-5">
                        <div class="d-flex justify-content-between align-items-center mb-3">
                            <h1 class="text-right">Profile Settings</h1>
                        </div>
                        
                        
                        <form action = "updateCus" method="post">
                        
                        <c:forEach var ="cus" items= "${cusDetails}">
                        
                        
						<c:set var = "id" value ="${cus.cusID}"/>
						<c:set var = "fName" value ="${cus.firstName}"/>
						<c:set var = "lname" value ="${cus.lastName}"/>
						<c:set var = "email" value ="${cus.email}"/>
						<c:set var = "user" value ="${cus.username}"/>
						<c:set var = "pass" value ="${cus.password}"/>
						<c:set var = "phoneNum" value ="${cus.phoneNum}"/>
						<c:set var = "seq" value ="${cus.sequrityQuestion}"/>
						
                        
                        
                        <div class="col-md-6"><label class="labels">Customer ID</label><input type="text" class="form-control" placeholder="" value="${cus.cusID}" readonly name="cusID"></div>
                        <div class="row mt-2">
                            
                            <div class="col-md-6"><label class="labels">First Name</label><input type="text" class="form-control" placeholder="first name" value="${cus.firstName}" name="fName"></div>
                            <div class="col-md-6"><label class="labels">Surname</label><input type="text" class="form-control" value="${cus.lastName}" placeholder="surname" name="lName"></div>
                            <div class="col-md-12"><label class="labels">Email ID</label><input type="text" class="form-control" placeholder="email id" value="${cus.email}" name = "email"></div>
                            <div class="col-md-6"><label class="labels">Username</label><input type="text" class="form-control" value="${cus.username}" placeholder="username" name="username"></div>
                            <div class="col-md-6"><label class="labels">Password</label><input type="text" class="form-control" value="${cus.password}" placeholder="password" name="pass"></div>
                        </div>
                        <div class="row mt-3">
                            <div class="col-md-12"><label class="labels">Mobile Number</label><input type="text" class="form-control" placeholder="phone number" value="${cus.phoneNum}" name = "phone"></div>
                            
   
                        </div>
                        <br>
                        <select name="" id="" class="form-control">
                            <option value="">Security Question insert here</option>
                          </select>

                        <div class="col-md-12"><input type="text" class="form-control" placeholder="sequrity question" value="${cus.sequrityQuestion}" name = "seqQ"></div>
                       
                        
                        
                        
                    	<br>
                        
                        <div class="input-box button">
        					<input type="Submit" value="Edit Changes">
      					</div>
      					
      					<br>
      					<br>
      					
      					</c:forEach>
      					
      					
                   </form>
                   
					<c:url value = "confirmDelete.jsp" var="delete">
					
					<!--  	<c:param name = "cusID" value ="${cus.cusID}"/>
						<c:param name = "fName" value ="${cus.firstName}"/>
						<c:param name = "lname" value ="${cus.lastName}"/>
						<c:param name = "email" value ="${cus.email}"/>
						<c:param name = "username" value ="${cus.username}"/>
						<c:param name = "pass" value ="${cus.password}"/>
						<c:param name = "phone" value ="${cus.phoneNum}"/>
						<c:param name = "seqQ" value ="${cus.sequrityQuestion}"/>-->
					
					
					</c:url>
						
                   
                   <div class="input-box button">
        					<a href = "${delete}">
        						<input type="button" value="Delete Account" class="delete_btn_profile">
        					</a>
      				</div>
      					
                   
                    </div>
                </div>
                
            </div>
        </div>
        
</body>
</html>