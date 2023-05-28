package com.Manager;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


public class DeleteTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int tid = Integer.parseInt(request.getParameter("tid"));
		
		boolean res;
		 res = TimeTableDBUtil.deleteTable(tid);
		
		if (res == true )
		{
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Successfuly Deleted');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
		}
		
		else
		{
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data not Deleted');");
			out.println("location = 'vehicleAdd.jsp'");
			out.println("</script>");
			
			
			
		}
	}
	
}


