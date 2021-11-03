package servlet_to_servlet.SendRedirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int k=Integer.parseInt(request.getParameter("num1"));
		
		Cookie cookie =new Cookie("k",k+"");
		response.addCookie(cookie);
		
//		HttpSession  session=request.getSession();
//		session.setAttribute("k", k);
		response.sendRedirect("SqServlet");
	}

}
