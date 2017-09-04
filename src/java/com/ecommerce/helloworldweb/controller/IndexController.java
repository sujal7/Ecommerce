/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet({"/index","/abc","/personalInfo"})
public class IndexController extends HttpServlet {
    // get: all the request are get request
    // post: after we specify something as post, only then
    // post request is sent
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
//        String ipAddress=request.getRemoteAddr();
//        String uri=request.getRequestURI();
        if(request.getRequestURI().equals(contextPath+"/index")){
            request.setAttribute("el", "We are practicing expression language... without JSTL");
            // el="we are practicing...."
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request,response);
        }
        
        if(request.getRequestURI().equals(contextPath+"/personalInfo")){
            RequestDispatcher rd=request.getRequestDispatcher("personalInfo.jsp");
            rd.forward(request,response);
        }
       

}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


