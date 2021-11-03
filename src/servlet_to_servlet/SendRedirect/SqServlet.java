package servlet_to_servlet.SendRedirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int k=0;
		Cookie cookies[]=request.getCookies();
		for(Cookie i: cookies)
		{
			if(i.getName().equals("k"))
			k=Integer.parseInt(i.getValue());	
			
				
		}
		
		
//		HttpSession session=request.getSession();
//		int k=(int)session.getAttribute("k");
		
		//int n=Integer.parseInt(request.getParameter("k"));
		PrintWriter pw=response.getWriter();
		pw.println("THE SQUARE IS"+(k*k));
	}

}
