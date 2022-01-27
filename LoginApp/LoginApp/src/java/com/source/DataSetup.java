/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.source;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author unroot
 */
public class DataSetup extends HttpServlet{
   @Override
   public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
       
       PrintWriter writer = res.getWriter();
       writer.print("Masud");
   } 
}
