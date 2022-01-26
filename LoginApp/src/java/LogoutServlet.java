

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LogoutServlet extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    request.getRequestDispatcher("login.html").include(request, response);
    
    Cookie ck = new Cookie("name","");
    ck.setMaxAge(0);
    response.addCookie(ck);
    
    out.print("You are successfully Logged out.");
 }
} 