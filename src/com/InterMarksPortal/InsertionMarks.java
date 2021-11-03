package com.InterMarksPortal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertionMarks")
public class InsertionMarks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		int maths=Integer.parseInt(request.getParameter("maths"));
		int physics=Integer.parseInt(request.getParameter("physics"));
		int chem =Integer.parseInt(request.getParameter("chem"));
		
		//Connecting to Database using JDBC Concepts.
		String url="jdbc:mysql://localhost:3306/practise";
		String username="root";
		String password="root";
		String query="insert into inter values("+id+",'"+name+"',"+maths+","+physics+","+chem+")";
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
