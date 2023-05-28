package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerRegister
 */
@WebServlet("/CustomerRegister")
public class CustomerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		 PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
		
		
		
		String firstName = request.getParameter("fName");
		String lastName = request.getParameter("lName");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String phone = request.getParameter("phoneNum");
		String pass = request.getParameter("password");
		String confPass = request.getParameter("confPassword");
		String securityQuestion = request.getParameter("security");
		
		boolean isTrue;
		
		isTrue = customerUtil.customerRegister(firstName, lastName, email, username,  pass, phone, securityQuestion);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
            out.println("alert('Registration failed');");
            out.println("location = 'customerRegistration.jsp'");
            out.println("</script>");
		}
		
		
	}

}