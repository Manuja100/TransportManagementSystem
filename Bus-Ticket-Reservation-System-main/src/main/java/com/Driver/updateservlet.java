package com.Driver;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw= response.getWriter();
try { 
	
	
			HttpSession session5 = request.getSession();
			String nic = (String) session5.getAttribute("user");

			//int id = Integer.parseInt(request.getParameter("driver_id"));
			String name = request.getParameter("name");
			String dob = request.getParameter("dob");
			String email = request.getParameter("email");
			//String NIC= request.getParameter("NIC");
			String phone = request.getParameter("phone");
			String password = request.getParameter("password");
//			String id = request.getParameter("id");
			
			
			boolean istrue;
			 istrue= DriverDBUtil.updateDriver(name, dob, email,phone ,password,nic);
			
			 if (istrue==true) {
				 
				 
				 
				 pw.println("<script type=\"text/javascript\">\r\n"
				 		+ "      alert('Details update successful');\r\n"
				 		+ "      location='DriverHome.jsp'\r\n"
				 		+ "    </script>");

			 }
			 else {
				 
				 pw.println("<script type=\"text/javascript\">\r\n"
					 		+ "      alert('Details update unsuccessful');\r\n"
					 		+ "      location='DriverHome.jsp'\r\n"
					 		+ "    </script>");

			 }
			
			
		
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
		
	}
		
		
		
	}


