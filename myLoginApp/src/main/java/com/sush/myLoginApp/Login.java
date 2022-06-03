package com.sush.myLoginApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
         
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
			
		if ( username.equals("Guest") && password.equals("guest"))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		
	}

}
