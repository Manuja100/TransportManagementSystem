package com.Driver;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DriverViewservlet")
public class DriverViewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		  
		
		
		 HttpSession session3 =request.getSession();
		 session3.getAttribute("user"); 
		 
		 String NIC= request.getParameter("NIC");
		
		session3.setAttribute("str",DriverDBUtil.showDetails(NIC));
		
		request.getRequestDispatcher("DriverView.jsp").forward(request, response);
			
	

	}	
}




