/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.dao;

//dao : -> database access object

import com.ecommerce.helloworldweb.model.ProductModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 */
public class ProductDao {
    public static void insert(ProductModel cm){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }
        Connection con=null;
        Statement st=null;
        try{
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecommerce_api","postgres","CrisSujal");
            
        }catch(Exception e){
            System.out.println(e);
        }
        String sql="insert into products(product_price, product_discount, product_name,"
                + " product_rating, product_image, product_tag) values("+cm.getProduct_price()+","+cm.getProduct_discount()+","+cm.getProduct_name()+","+cm.getProduct_name()+","+cm.getProduct_rating()+","+cm.getProduct_image()+","+cm.getProduct_tag()+")";
        try{
            st=con.createStatement();
            st.execute(sql);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
