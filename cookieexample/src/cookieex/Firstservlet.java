package cookieex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Firstservlet extends HttpServlet {
	protected void dopost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String name=req.getParameter("nm");
		Cookie Ck=new Cookie("nmg",name);
		//Ck.setMaxAge(30*60);
		resp.addCookie(Ck);
		//RequestDispatcher rd=req.getRequestDispatcher("ss");
		//rd.forward(req,resp);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<form action='ss'>");
		out.print("<input type='submit' value='NextServlet'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
	}

}
