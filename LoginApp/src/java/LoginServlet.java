/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
 @Override
 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
         throws IOException, ServletException{
     response.setContentType("text/html");
     PrintWriter out = response.getWriter();
     
     request.getRequestDispatcher("link.html").include(request, response);
     
     String name = request.getParameter("name");
     String password = request.getParameter("password");
     
     if(password.equals("admin1234")){
         out.print("You are successfully Logged in");
         out.print("<br>Welcome, "+name);
         
         Cookie ck = new Cookie("name",name);
         response.addCookie(ck);
         
     }else{
         out.print("sorry, username or password error");
         request.getRequestDispatcher("login.html").include(request, response);
         
     }
     out.close();
 }

}