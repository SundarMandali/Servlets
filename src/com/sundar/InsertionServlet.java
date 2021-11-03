package com.sundar;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertionServlet")
public class InsertionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("empid"));
	String name=request.getParameter("empname");
	
	//Connecting to Database using JDBC Concepts.
	String url="jdbc:mysql://localhost:3306/practise";
	String username="root";
	String password="root";
	String query="insert into employee values("+id+",'"+name+"')";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);	
		Statement st = con.createStatement();
		st.executeUpdate(query);
		st.close();
		con.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	
	
	
	PrintWriter pw=response.getWriter();
	pw.println("Record Inserted");
	
	}

}
