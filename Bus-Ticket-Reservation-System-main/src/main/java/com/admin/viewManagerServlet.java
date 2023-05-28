package com.admin;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/viewManagerServlet")
public class viewManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int empID = Integer.parseInt(request.getParameter("empid"));
		String position = request.getParameter("pos");
		boolean res;
		
		res = adminDBUtil.validate(empID,position);
		
		if(res == true) {
		
			List<Manager> manDetails = adminDBUtil.getManagerDetails(empID,position);
			request.setAttribute("manDetails", manDetails); 
		
		
			RequestDispatcher dis = request.getRequestDispatcher("viewManager.jsp");
			dis.forward(request,response);
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('position is not matching');");
			out.println("location = 'addManager.jsp'");
			out.println("</script>");
			
		}
		
		
	}
	}


