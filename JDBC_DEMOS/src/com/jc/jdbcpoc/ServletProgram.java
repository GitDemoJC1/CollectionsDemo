package com.jc.jdbcpoc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletProgram implements Servlet {
	ServletConfig config=null; 
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	public void init(ServletConfig config){  
	this.config=config;  
	System.out.println("servlet is initialized");  
	} 

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html");  
		  
		PrintWriter out=res.getWriter();  
		out.print("<html><body>");  
		out.print("<b "+">hello simple servlet</b>");  
		out.print("</body></html>");  
		System.out.println(req.getProtocol());
		
	}
	
	public String tagGenerator(String tag,String content) {
		return null;
	}

}
