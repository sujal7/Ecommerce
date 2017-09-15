/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.controller;

import com.ecommerce.helloworldweb.dao.ProductDao;
import com.ecommerce.helloworldweb.model.ProductModel;
import com.ecommerce.helloworldweb.utilities.FileUpload;
import com.ecommerce.helloworldweb.utilities.Tag;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 *
 */
@WebServlet({"/admin/product/add", "/admin/product/delete/"})
public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/admin/product/delete/")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String fileName=request.getParameter("file");
            if(ProductDao.delete(id)){
                FileUpload.deleteFile(request,fileName);
            }
            response.sendRedirect(contextPath + "/admin/product");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String contextPath = request.getContextPath();
        if (request.getRequestURI().equals(contextPath + "/admin/product/add")) {
            String saveLocation = request.getServletContext().getRealPath("/files");
            MultipartRequest mr = new MultipartRequest(request, saveLocation, 1000000, new DefaultFileRenamePolicy());
            String imageName=mr.getOriginalFileName("files");
            String name = mr.getParameter("pname");
            int price = Integer.parseInt(mr.getParameter("pprice"));
            int discount = Integer.parseInt(mr.getParameter("pdiscount"));
            // String tags = request.getParameter("ptags");
            String[] a = mr.getParameterValues("ptags");
            String tags = Tag.convertTag(a);

            //file upload garna baki xa
            // encapculate the data
            ProductModel pm = new ProductModel();
            pm.setProduct_name(name);
            pm.setProduct_discount(discount);
            pm.setProduct_price(price);
            pm.setProduct_tag(tags);
            pm.setProduct_image(imageName);

            //send the object to dao
            ProductDao.insert(pm);
            response.sendRedirect(contextPath + "/admin/product");

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
