/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet({"/admindashboard","/admin/product"})
public class AdminController extends HttpServlet {  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath=request.getContextPath();
        if(request.getRequestURI().equals(contextPath+"/admindashboard")){
            RequestDispatcher rd=request.getRequestDispatcher("admin-dashboard.jsp");
            rd.forward(request, response);
        }
        else if(request.getRequestURI().equals(contextPath+"/admin/product")){
            RequestDispatcher rd=request.getRequestDispatcher("/admin-product.jsp");
            rd.forward(request, response);
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
