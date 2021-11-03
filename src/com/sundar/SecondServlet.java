package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SecondServlet")
public class SecondServlet implements Servlet {
	ServletConfig config;

	public void init(ServletConfig config)
{
	this.config=config;
}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException
	{
		String first=request.getParameter("fname");
		String second=request.getParameter("sname");
		
		PrintWriter pw=response.getWriter();
		pw.println("Hello "+first+" "+second+"Welcome to Second Servlet");
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
