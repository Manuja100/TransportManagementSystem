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
import java.util.List;

@WebServlet("/UpdateVehicleServlet")

public class UpdateVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("busid");
		String regno = request.getParameter("Regno");
		String route = request.getParameter("Route");
		String seat = request.getParameter("Seat");
		String type = request.getParameter("Type");
		
		boolean result;
		
		result = vehicleDBUtil.updateVehicle(id, regno, route, seat, type);
		
		if(result == true) {
			
			List <vehicle> vehiDetails = vehicleDBUtil.getVehicleDetails(regno); 
			request.setAttribute("vehiDetails",vehiDetails);
			
			RequestDispatcher disp = request.getRequestDispatcher("vehicleDetails.jsp");
			disp.forward(request, response);
			
			
			
		}
		
		else {
			
			List <vehicle> vehiDetails = vehicleDBUtil.getVehicleDetails(regno);
			request.setAttribute("vehiDetails",vehiDetails);
			
			RequestDispatcher disp = request.getRequestDispatcher("vehicleDetails.jsp");
			disp.forward(request, response);
		}
		
	}

}
