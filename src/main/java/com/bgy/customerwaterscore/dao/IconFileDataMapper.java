package com.bgy.customerwaterscore.dao;

import com.bgy.customerwaterscore.model.IconFileData;
import com.bgy.customerwaterscore.model.IconFileDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public interface IconFileDataMapper {
    long insert(IconFileData record);
    IconFileData selectByPrimaryKey(Long id);
}