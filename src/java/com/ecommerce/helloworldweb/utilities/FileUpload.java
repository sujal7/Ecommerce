/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.helloworldweb.utilities;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.io.File;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ADMIN
 */
public class FileUpload {
    public static boolean deleteFile(HttpServletRequest request, String fileName){
        String path=request.getServletContext().getRealPath("/files");
        File file=new File(path+File.separatorChar+fileName);
        if(file.delete()){
            return true;
        }else{
            return false;
        }
    }
    
}
