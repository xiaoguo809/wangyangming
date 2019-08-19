package com.bgy.customerwaterscore.service.impl;

import com.bgy.customerwaterscore.dao.IconFileDataMapper;
import com.bgy.customerwaterscore.model.IconFileData;
import com.bgy.customerwaterscore.model.IconFileDataExample;
import com.bgy.customerwaterscore.service.IconFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author guoxujie
 * date 2019年8月16日
 */
@Service
public class IconFileServiceImpl  implements IconFileService {

    @Autowired
    IconFileDataMapper iconFileDataMapper;

    @Override
    public IconFileData getIconFile(Long iconFileId) {
        return iconFileDataMapper.selectByPrimaryKey(iconFileId);
    }
//
//    @Override
//    public int deleteIconFile(Long iconFileId) {
//        return iconFileDataMapper.deleteByPrimaryKey(iconFileId);
//    }

    @Override
    public int addIconFile(IconFileData icon) {
        return (int)iconFileDataMapper.insert(icon);
    }

//    @Override
//    public int updateIconFile(IconFileData icon, IconFileDataExample example) {
//        return iconFileDataMapper.updateByExampleSelective(icon,example);
//    }
}
