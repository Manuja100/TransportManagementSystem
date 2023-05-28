package com.Driver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete_driver")
public class Delete_driver extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pw= response.getWriter();
		try { 

					
					
					String NIC= request.getParameter("NIC");
					System.out.println(NIC);
					
					boolean istrue;
					 istrue= DriverDBUtil.deleteDriver(NIC);
					
					 if (istrue==true) {
						 pw.println("<script type=\"text/javascript\">\r\n"
						 		+ "      alert('Detail delete successful');\r\n"
						 		+ "      location='DriverForm.jsp'\r\n"
						 		+ "    </script>");

					 }
					 else {
						 
						 pw.println("<script type=\"text/javascript\">\r\n"
							 		+ "      alert('Detail delete unsuccessful');\r\n"
							 		+ "      location='DriverView.jsp'\r\n"
							 		+ "    </script>");

					 }
					
					
				
				} 
				catch (Exception e) { 
					e.printStackTrace(); 
				} 
				
			}
	}


