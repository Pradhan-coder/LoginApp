package com.source;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





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