package com.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DriverLoginServlet")
public class DriverLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			String NIC = request.getParameter("uid");
			String password = request.getParameter("pass");
			
			
			
			try {
				
				driverUtil dri = new driverUtil();

				
				boolean isTrue;
				
				isTrue = dri.validate(NIC, password);
				
				if(isTrue == true) {
					
					
					
					HttpSession session = request.getSession();
					session.setAttribute("user", NIC );
					
					
					
					RequestDispatcher dis = request.getRequestDispatcher("DriverHome.jsp");
					dis.forward(request, response);
					
				
				}else {
					
					out.println("<script type='text/javascript'>");
		            out.println("alert('Username or password is incorrect');");
		            out.println("location = 'driverLogin.jsp'");
		            out.println("</script>");
		
				}
				

				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
