package com.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
				
				 PrintWriter out = response.getWriter();
			     response.setContentType("text/html");
				
				
				String email = request.getParameter("uid");
				String password = request.getParameter("pass");
				
				
				try {
					
					boolean isTrue;
					
					isTrue = customerUtil.validate(email, password);
					
					if(isTrue == true) {
						
						
						
						HttpSession session = request.getSession();
						session.setAttribute("user", email );
						
						
						
						RequestDispatcher dis = request.getRequestDispatcher("customerHome.jsp");
						dis.forward(request, response);
						
					
						
	
						
					}else {
						
						out.println("<script type='text/javascript'>");
			            out.println("alert('Username or password is incorrect');");
			            out.println("location = 'login.jsp'");
			            out.println("</script>");
			
					}
					
	
					
				}catch(Exception e) {
					e.printStackTrace();
				}
	
			}

	}
