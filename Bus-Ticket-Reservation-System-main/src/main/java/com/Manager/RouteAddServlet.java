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


@WebServlet("/RouteAddServlet")

public class RouteAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String start = request.getParameter("start");
		String destination = request.getParameter("dest");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean res = routeDBUtil.insertRoute(start, destination);
		
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
