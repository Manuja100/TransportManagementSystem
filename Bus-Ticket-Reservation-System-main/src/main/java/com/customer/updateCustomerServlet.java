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
import javax.servlet.http.HttpSession;
import javax.tools.DocumentationTool.Location;

/**
 * Servlet implementation class updateCustomerServlet
 */
@WebServlet("/updateCustomerServlet")
public class updateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out = response.getWriter();
	     response.setContentType("text/html");
		
		
		
		String id = request.getParameter("cusID");
		String fname = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email2 = request.getParameter("email");
		String user = request.getParameter("username");
		String pass = request.getParameter("pass");
		String phone = request.getParameter("phone");
		String secQues = request.getParameter("seqQ");
		
		boolean isTrue ; 
		isTrue = customerUtil.updateCustomer(id, fname, lName, email2, user, pass, phone, secQues);
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("user");
		
		if(isTrue == true) {
			
//			HttpSession session = request.getSession();

//session.getAttribute("user");
			
			
			List<customer> cusDetails = customerUtil.getCustomerDetails(email);
			request.setAttribute("cusDetails", cusDetails);
			
		
	          RequestDispatcher dis3 = request.getRequestDispatcher("customerProfile.jsp");
	          dis3.forward(request, response);
    	
            
		}else {
			List<customer> cusDetails = customerUtil.getCustomerDetails(email);
			request.setAttribute("cusDetails", cusDetails);
			
			out.println("<script type='text/javascript'>");
            out.println("alert('Details were not Updated Try Again');");
            out.println("location = 'customerProfile.jsp'");
            out.println("</script>");
			
		}
		
	}

}
