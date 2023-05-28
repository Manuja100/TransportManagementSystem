package com.Driver;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/DriverServlet")
public class DriverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
try { 

			
			String name = request.getParameter("name");
			String dob = request.getParameter("dob");
			String email = request.getParameter("email");
			String NIC= request.getParameter("NIC");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
			
			boolean istrue;
			
			    istrue= DriverDBUtil.insertDriver(name, dob, email, NIC , phone ,password);
			  
			HttpSession session=request.getSession();
			
			 if (istrue==true) {
				 pw.println("<script type=\"text/javascript\">\r\n"
				 		+ "      alert('Details added successful');\r\n"
				 		+ "      location='login_index.html'\r\n"
				 		+ "    </script>");
//				 RequestDispatcher dis=request.getRequestDispatcher("inputPlace.jsp");
//				 dis.forward(request, response);
			 }
			 else {
				 
				 pw.println("<script type=\"text/javascript\">\r\n"
					 		+ "      alert('Details added unsuccessful');\r\n"
					 		+ "      location='DriverForm.jsp'\r\n"
					 		+ "    </script>");
//				 RequestDispatcher dis=request.getRequestDispatcher("home.jsp");
//				 dis.forward(request, response);
			 }
			
			session.setAttribute("driver_id",NIC);
		
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
	}

}
