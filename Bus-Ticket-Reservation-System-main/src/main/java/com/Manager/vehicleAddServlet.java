package com.Manager;

import javax.servlet.ServletException;




import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;




@WebServlet("/vehicleAddServelt")


public class vehicleAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String regno =request.getParameter("Regno");
		String type =request.getParameter("bus");
		String seat =request.getParameter("seats");
		String ac =request.getParameter("AC");
		String wifi =request.getParameter("wifi");
		String cctv =request.getParameter("cctv");
		String mp3 =request.getParameter("mp3");
		String mp4 =request.getParameter("mp4");
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean res ;
		
		res = vehicleDBUtil.insertVehicle(regno,type, seat, ac,wifi,cctv,mp3,mp4);
		
		if (res == true )
		{
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data successfuly Added');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
		}
		
		else
		{
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data not added');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
			
			
			
			
		}
		
	
	}

}
