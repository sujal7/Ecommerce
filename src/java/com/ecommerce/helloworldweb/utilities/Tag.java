/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.utilities;

/**
 *
 * @author ADMIN
 */
public class Tag {
    public static String convertTag(String[] a){
        String tags="";
           for(int i=0; i<a.length; i++){
                tags=a[i]+","+tags;
            }
           return tags;
         
    }
    
}
