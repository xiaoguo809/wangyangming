package com.bgy.customerwaterscore.service.impl;

import com.bgy.customerwaterscore.dao.IconDataMapper;
import com.bgy.customerwaterscore.dao.IconFileDataMapper;
import com.bgy.customerwaterscore.dao.UserMapper;
import com.bgy.customerwaterscore.model.*;
import com.bgy.customerwaterscore.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * author guoxujie
 * date 2019/08/16
 */
@Service
public class IconServiceImpl implements IconService {

    @Autowired
    IconDataMapper iconDataMapper;

    @Autowired
    IconFileDataMapper iconFileDataMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public List<IconData> getIcon(IconDataExample example) {
        return iconDataMapper.selectByExample(example);
    }
//
//    @Override
//    public IconData getIconByPrimaryKey(Long id) {
//        return iconDataMapper.selectByPrimaryKey(id);
//    }
//
//    @Override
//    public int deleteIcon(Long iconId) {
//        return iconDataMapper.deleteByPrimaryKey(iconId);
//    }
//
//    @Override
//    public int updateIcon(Map params) {
//        return 0;
//    }
//
//    @Transactional(rollbackFor = RuntimeException.class)
//    @Override
//    public int addIcon(IconData icon) {
//        IconFileData iconFile= new IconFileData();
//        iconFile.setName("样例待添加属性");
//        Long iconFileId= (long)iconFileDataMapper.insert(iconFile);
//        icon.setIconFileId(iconFileId);
//        return iconDataMapper.insert(icon);
//    }

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public int  addIconFromMultipartFile(MultipartFile file){

        try {
            if(file.getSize()> FileSizeEnum.OneM.getSize()){
                //这个地方 也应该用枚举类型的
                return  -1;
            }
            IconFileData iconFile =this.getIconFile(file);



            long id= iconFileDataMapper.insert(iconFile);
            IconData icon= new IconData();
            icon.setIconFileId(id);
            icon.setIconType(0);
            icon.setIconFileType(0);
            icon.setName(file.getOriginalFilename());
            icon.setSize((int)file.getSize());
            long rsCode=iconDataMapper.insert(icon);

            System.out.println("执行成功");
            return  rsCode>0?1:-1;
        }catch (IOException e){
            //dosomething

        }
        return  -1;
    }
    private IconFileData getIconFile(MultipartFile file) throws IOException {
        IconFileData iconFile =new IconFileData();
        String name =file.getOriginalFilename();
        byte[] s= file.getBytes();
        iconFile.setName(name);
        iconFile.setFileInfo(s);
        return iconFile;
    }
}
