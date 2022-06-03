
package com.sush.mywebPrj;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;


public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SqServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int k = 0; 
		
		ServletConfig cfg = getServletConfig();
		String str1 = cfg.getInitParameter("SqParam");
		
		Cookie cookies[] = request.getCookies();
		
		for(Cookie c : cookies) {
			if( c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue() );
			}
		}
		
		k = k*k ;
		PrintWriter out = response.getWriter();
		out.print("<html><body bgcolor='lightgreen'>");
		out.print(k +  "  " + str1);
		out.print("</body></html>");
		
	}

}
