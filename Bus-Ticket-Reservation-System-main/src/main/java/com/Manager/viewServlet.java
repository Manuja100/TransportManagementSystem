package com.Manager;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/viewServlet")

public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String regno = request.getParameter("Regno");
		
		boolean res;
		res = vehicleDBUtil.validate(regno);
		
		if(res == true) {
		
			List<vehicle> vehiDetails = vehicleDBUtil.getVehicleDetails(regno);
			request.setAttribute("vehiDetails", vehiDetails);
		
		
			RequestDispatcher dis = request.getRequestDispatcher("vehicleDetails.jsp");
			dis.forward(request,response);
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Registration Number is Incorrect');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}
