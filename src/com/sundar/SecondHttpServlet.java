package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondHttpServlet")
public class SecondHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		int a=Integer.parseInt(request.getParameter("num1"));
//		int b=Integer.parseInt(request.getParameter("num2"));
//		PrintWriter pw=response.getWriter();
//		pw.println("Addition of num1 and num2 is "+(a+b));
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a=Integer.parseInt(request.getParameter("num1"));
		int b=Integer.parseInt(request.getParameter("num2"));
		PrintWriter pw=response.getWriter();
		pw.println("Addition of num1 and num2 is "+(a+b));
	}

}
