package com.bgy.customerwaterscore.controller;

import com.bgy.customerwaterscore.model.IconData;
import com.bgy.customerwaterscore.model.IconDataExample;
import com.bgy.customerwaterscore.model.IconFileData;
import com.bgy.customerwaterscore.model.IconFileDataExample;
import com.bgy.customerwaterscore.service.IconFileService;
import com.bgy.customerwaterscore.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * author guoxjie
 * date 2019/08/16
 */
@Controller
@RequestMapping(value = "/icon")
public class IconController {

    @Autowired
    IconService iconService;

    @Autowired
    IconFileService iconFileService;


    @RequestMapping(value = "/uploadFiles",method = RequestMethod.POST)
    public String uploadFiles(@RequestParam("file") MultipartFile file) throws IOException {
        if(file.isEmpty()){
            return "有错误";
        }
        iconService.addIconFromMultipartFile(file);
        return  "login";
    }

    @RequestMapping(value = "/getIcon")
    public void getIcon(long id, HttpServletResponse response) throws  IOException{
        IconDataExample iconDataExample= new IconDataExample();
        IconDataExample.Criteria criteria= iconDataExample.createCriteria();
        iconDataExample.setDistinct(false);
        criteria.andIdEqualTo(id);
        IconData icon= iconService.getIcon(iconDataExample).get(0);
        long fileId= icon.getIconFileId();
        IconFileData fileData= iconFileService.getIconFile(id);
        byte[] b=  fileData.getFileInfo();
        response.setContentType("image/jpg");
        OutputStream out = response.getOutputStream();
        out.write(b);
        out.flush();
        out.close();
        System.out.println("查询到了一个对象");
    }
}
