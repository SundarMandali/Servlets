package com.UserLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		String query="select * from login where uname='"+uname+"' and pwd='"+pwd+"'";
		PrintWriter pw=response.getWriter();
		
		String url="jdbc:mysql://localhost:3306/practise";
		String username="root";
		String password="root";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			
			if(rs.next())
				pw.println("Username:"+rs.getString(1));	
			else 
				pw.println("Login Credentials Invalid");	
			st.close();
			con.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
		
	}

}
