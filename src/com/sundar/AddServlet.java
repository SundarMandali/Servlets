package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/AddServlet")
public class AddServlet implements Servlet{
	ServletConfig config;

	public void init(ServletConfig config)
{
	this.config=config;
}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException
	{
		int a=Integer.parseInt(request.getParameter("num1"));
		int b=Integer.parseInt(request.getParameter("num2"));
		PrintWriter pw=response.getWriter();
		pw.println("The sum of num1 and num2 is "+(a+b));
		
	}
	public void destroy()
	{
		
	}
	public ServletConfig getServletConfig()
	{
		return config;
		
	}
	public String getServletInfo()
	{
		return null;
		
	}

}
