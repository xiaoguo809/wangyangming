package com.bgy.customerwaterscore.service;

import com.bgy.customerwaterscore.model.IconFileData;
import com.bgy.customerwaterscore.model.IconFileDataExample;
import org.springframework.web.multipart.MultipartFile;

/**
 * author guoxujie
 * date 2019-08-15
 **/
public interface IconFileService {
    IconFileData getIconFile(Long iconFileId);
//
//    int deleteIconFile(Long iconFileId);

    int addIconFile(IconFileData icon);



//    int updateIconFile(IconFileData icon, IconFileDataExample example);
}
