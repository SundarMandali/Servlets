package com.InterMarksPortal;

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


@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		//Connecting to Database using JDBC Concepts.
				String url="jdbc:mysql://localhost:3306/practise";
				String username="root";
				String password="root";
				String query="select * from inter where id="+id;
				PrintWriter pw=response.getWriter();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,username,password);	
					Statement st = con.createStatement();
					ResultSet rs=st.executeQuery(query);
					
					pw.println("The Details of the Student are");
					rs.next();
					
						pw.println("Student id:"+rs.getInt(1));
						pw.println("Student name:"+rs.getString(2));
						pw.println("Maths marks:"+rs.getInt(3));
						pw.println("Physics marks:"+rs.getInt(4));
						pw.println("Chemistry marks:"+rs.getInt(5));
					
					
					
					st.close();
					con.close();
				} catch (Exception e) {
				e.printStackTrace();
				}
				
				
				
				
		
	}

}
