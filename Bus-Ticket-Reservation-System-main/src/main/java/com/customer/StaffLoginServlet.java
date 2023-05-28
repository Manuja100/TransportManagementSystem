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


@WebServlet("/StaffLoginServlet")
public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 PrintWriter out = response.getWriter();
		     response.setContentType("text/html");
			
			
			String email = request.getParameter("uid");
			String password = request.getParameter("pass");
			
			
			try {
				
				staffUtil st = new staffUtil();
				boolean isTrue;
				
				isTrue = st.validate(email, password);
				
				if(isTrue == true) {
					
					
					
					HttpSession session = request.getSession();
					session.setAttribute("user", email );
					
					List<Sttaf> stDetails= staffUtil.checkPosition(email, password);
//					String position =stDetails.get(6).getPositin();
					
					
					for(Sttaf s:stDetails) {
						
						String pos = s.getPositin();
						
						if(pos.equalsIgnoreCase("Manager")) {
							out.println("<script type='text/javascript'>");
							out.println("location = 'vehicleAdd.jsp'");
							 out.println("</script>");
						}else if(pos.equalsIgnoreCase("Admin")) {
							out.println("<script type='text/javascript'>");
							out.println("location = 'admin_home.jsp'");
							 out.println("</script>");
						}
						
					}
					
					
					
//					RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
//					dis.forward(request, response);
	
					
				}else {
					
					out.println("<script type='text/javascript'>");
		            out.println("alert('Username or password is incorrect');");
		            out.println("location = 'staffLogin.jsp'");
		            out.println("</script>");
		
				}
				
	
				
			}catch(Exception e) {
				e.printStackTrace();
			}

	}

}
