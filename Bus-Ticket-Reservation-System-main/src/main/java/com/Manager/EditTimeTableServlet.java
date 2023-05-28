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




public class EditTimeTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
	
		
		
		
		String btn = request.getParameter("param1");
		
		try {
		
			List<timeTable> timeDetails = TimeTableDBUtil.gettime(btn);
			request.setAttribute("timeDetails", timeDetails);
		
		
			RequestDispatcher dis = request.getRequestDispatcher("editTime.jsp");
			dis.forward(request,response);	
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		}
		
	
	
		
}

