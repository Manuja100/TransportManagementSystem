package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteCustomerServlet
 */
@WebServlet("/deleteCustomerServlet")
public class deleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
		
		
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("user");
		
		boolean isTrue ; 
		
		isTrue = customerUtil.deleteCustomer(email);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
            out.println("alert('Account Perm Deleted');");
            out.println("location = 'index.html'");
            out.println("</script>");
            
           session.invalidate();
           // response.sendRedirect("success.jsp"); 
   
            
		}else {
			out.println("<script type='text/javascript'>");
            out.println("alert('Account Not Deleted');");
            out.println("location = 'confirmDelete.jsp'");
            out.println("</script>");
		}
		
	}

}
