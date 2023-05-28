package com.Manager;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddTimeServlet")

public class AddTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int busno =Integer.parseInt(request.getParameter("busno"));
		int routeNo =Integer.parseInt(request.getParameter("rtno"));
		String stime =request.getParameter("sTime");
		String reach =request.getParameter("destTime");
		String status =request.getParameter("status");
		String date = request.getParameter("dte");
		int price = Integer.parseInt(request.getParameter("price"));
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean res ;
		
		res = TimeTableDBUtil.AddTime(busno, routeNo, stime,reach,date,status,price);
		
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
			out.println("location ='vehicleAdd.jsp'");
			out.println("</script>");
			
			
			
			
		}
		
	
	}
	}


