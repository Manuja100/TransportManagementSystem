package com.admin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateManagerServlet")
public class updateManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String id = request.getParameter("empid");
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone");
	        String password = request.getParameter("pss");
	        String posi = request.getParameter("pos");
	        
	        boolean isTrue;
	        
	        isTrue = adminDBUtil.updateManager(id, name, email, phone, password, posi);
	        
	        if(isTrue == true) {
	        	
	            RequestDispatcher dis = request.getRequestDispatcher("viewManagerDetails.jsp");
	            dis.forward(request, response);
	        
			
		}
		
	}

}
