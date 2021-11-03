package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Date")
public class DateDisplayServlet implements Servlet {
	ServletConfig config;

	public void init(ServletConfig config)
{
	this.config=config;
}
	
	public void service(ServletRequest request,ServletResponse response) throws IOException
	{
		Date d=new Date();
		PrintWriter pw=response.getWriter();
		pw.println(d);
		
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
