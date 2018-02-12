package servlet111;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	PrintWriter out=response.getWriter();
		
		response.setContentType("text/html");
		
		String n=request.getParameter("username");
		
		String p=request.getParameter("phone");
		
		if(p.isEmpty())
		{
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		
		rd.forward(request, response);
		
		}
		
		else{
			
			
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			
			out.println("enter correct password");
			rd.include(request, response);
			
			
		}
		out.close();
	}

}
