package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Manager.vehicle;
import com.Manager.vehicleDBUtil;

/**
 * Servlet implementation class selectRouteServlet
 */
@WebServlet("/selectRouteServlet")
public class selectRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
			String from = request.getParameter("from");
			String to = request.getParameter("to");
			
			
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			
			boolean res;
			res = customerUtil.validateRoute(from, to);
			
			if(res == true) {
			
				List<customerBookingView> bookingDetails = customerUtil.selectRoute(from, to);
				request.setAttribute("bookingDetails", bookingDetails);
				
				
				RequestDispatcher dis = request.getRequestDispatcher("busBooking.jsp");
				dis.forward(request,response);
			}
			
			else {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Busses are not available in this route');");
				out.println("location = 'customerHome.jsp'");
				out.println("</script>");
				
			}
			
			
	}

}
