package com.Driver;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/showSalary")
public class showSalary extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		
		HttpSession session3 = request.getSession();
		session3.getAttribute("user");  

	
		
		String NIC= request.getParameter("NIC");
		System.out.println(NIC);
		
		try {
			
			List<DriverSalary>showSalary =DriverDBUtil.showSalary(NIC);
			request.setAttribute("showSalary",showSalary);
//			request.getRequestDispatcher("showSalary.jsp").forward(request, response);
			
			System.out.println(showSalary);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("salaryViwe.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
