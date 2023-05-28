package com.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertManager")
public class insertManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone");
	        //String uname = request.getParameter("uname");
	        String psw = request.getParameter("psw");
	        
	        boolean isTrue;
	        
	        isTrue = adminDBUtil.insertManager(name, email, phone, psw);
	        
	        if (isTrue == true) {
	            
	            RequestDispatcher dis = request.getRequestDispatcher("managerInsert.jsp");
	            dis.forward(request, response);
	            
	        }else {
	            
	            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
	            dis2.forward(request, response);
	            
	        }
	}

}
