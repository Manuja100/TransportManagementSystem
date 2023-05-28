package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class customerProfileServlet
 */
@WebServlet("/customerProfileServlet")
public class customerProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("user");
		
		List<customer> cusDetails = customerUtil.getCustomerDetails(email);
		request.setAttribute("cusDetails", cusDetails);
		
		RequestDispatcher dis3 = request.getRequestDispatcher("customerProfile.jsp");
		dis3.forward(request, response);

	}
}