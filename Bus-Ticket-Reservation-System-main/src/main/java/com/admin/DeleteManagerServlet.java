package com.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.admin.adminDBUtil;

@WebServlet("/DeleteManagerServlet")
public class DeleteManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
	//	String id = request.getParameter("empid");
		String email = request.getParameter("email");
	
		boolean result ;
		
		result = adminDBUtil.deleteManager(email);
		
		if (result == true )
		{
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Successfuly Deleted');");
			out.println("location = 'admin_home.jsp'");
			out.println("</script>");
		}
		
		else
		{
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data not Deleted');");
			out.println("location = 'viewManager.jsp'");
			out.println("</script>");
			
			
			
		}
		
	}

}
