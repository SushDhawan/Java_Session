package com.sush.mywebPrj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.ejb.EJB;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public AddServlet() {
        super();
       
    }

    @EJB
    AddEJB addEJB;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		System.out.println("i = " +i+ "  j = " + j);
		
			addEJB.setI(i);
			addEJB.setJ(j);
			
			addEJB.add();
				  
		  PrintWriter out = response.getWriter();
		  
		  out.print("adding  from Session Bean : " + addEJB.getK() );
		 
	
	}
	
}
