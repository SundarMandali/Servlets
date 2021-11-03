package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {

	ServletConfig config;

	public void init(ServletConfig config)
{
	this.config=config;
}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException
	{
		PrintWriter pw=response.getWriter();
		pw.println("<b>Hello welcome to first Servlet</b>");
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
