package com.bgy.customerwaterscore.service;

import com.bgy.customerwaterscore.model.IconData;
import com.bgy.customerwaterscore.model.IconDataExample;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * author guoxujie
 * date 2019/08/15
 */
public interface IconService {
    List<IconData> getIcon(IconDataExample example);
//
//    IconData getIconByPrimaryKey(Long id);
//
//    int deleteIcon(Long iconId);
//
//    int updateIcon(Map iconMap);
//
//    int addIcon(IconData icon);

    int addIconFromMultipartFile(MultipartFile file);
}
