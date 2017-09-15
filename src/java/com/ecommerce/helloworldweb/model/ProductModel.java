/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class ProductModel implements Serializable{
    private static long serialversionUID=1L;
    private int product_id, product_price, product_discount;
    private String product_name, product_rating, product_image, product_tag;

    public ProductModel() {
    }

    public ProductModel(int product_id, int product_price, int product_discount, String product_name, String product_rating, String product_image, String product_tag) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.product_name = product_name;
        this.product_rating = product_rating;
        this.product_image = product_image;
        this.product_tag = product_tag;
    }
    
    

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_discount() {
        return product_discount;
    }

    public void setProduct_discount(int product_discount) {
        this.product_discount = product_discount;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_rating() {
        return product_rating;
    }

    public void setProduct_rating(String product_rating) {
        this.product_rating = product_rating;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_tag() {
        return product_tag;
    }

    public void setProduct_tag(String product_tag) {
        this.product_tag = product_tag;
    }
    
    
    

    
}
