package com.Manager;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteVehicleServlet")

public class DeleteVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String regno = request.getParameter("regno");
	
		boolean result ;
		
	
		
		result = vehicleDBUtil.deleteVehicle(regno);
		
		if (result == true )
		{
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data were Successfuly Deleted');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
		}
		
		else
		{
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data were not Deleted');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
			
			
			
		}
	}

}
