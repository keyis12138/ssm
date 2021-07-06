package com.xtq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class filecontroller {
    @RequestMapping("/toupload")
    public  String toUpload(){
        return "upload";
    }

    @RequestMapping("/doupload")
    public String upload(@RequestParam("file")CommonsMultipartFile file,
                         HttpSession httpSession) throws IOException {

        String filename = file.getOriginalFilename();
        String time = new SimpleDateFormat("yyMMdd").format(new Date());
        String path = httpSession.getServletContext().getRealPath("/WEB-INF/upload/"+time);

        File uploadFile = new File(path,filename);
        uploadFile.getParentFile().mkdirs();//创建文件夹


        file.transferTo(uploadFile);

        return "upload";
    }
}
