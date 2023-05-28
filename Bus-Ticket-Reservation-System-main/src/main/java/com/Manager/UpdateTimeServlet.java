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

@WebServlet("/UpdateTimeServlet")
public class UpdateTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int tid = Integer.parseInt(request.getParameter("tid"));
		int id = Integer.parseInt(request.getParameter("busno"));
		int routeId = Integer.parseInt(request.getParameter("routeId"));
		String start = request.getParameter("start");
		String reach = request.getParameter("reach");
		String date = request.getParameter("date");
		String status = request.getParameter("status");
		int price = Integer.parseInt(request.getParameter("price"));
		   
		boolean res ;
		res = TimeTableDBUtil.updateTime(tid,id, routeId, start,reach,date,status,price);
		
		if(res == true) {
			
			String btn = "cool";
			
			List<timeTable> timeDetails = TimeTableDBUtil.gettime(btn);
			request.setAttribute("timeDetails", timeDetails);
		
		
			RequestDispatcher dis = request.getRequestDispatcher("editTime.jsp");
			dis.forward(request,response);	
			
			
			
		}
		
		else {
			
			List<timeTable> timeDetails = TimeTableDBUtil.gettime("cool");
			request.setAttribute("timeDetails", timeDetails);
		
		
			RequestDispatcher dis = request.getRequestDispatcher("editTime.jsp");
			dis.forward(request,response);	
			
		}
		
		
		
	}

}
