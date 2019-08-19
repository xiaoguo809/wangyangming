package com.bgy.customerwaterscore.dao;

import com.bgy.customerwaterscore.model.IconData;
import com.bgy.customerwaterscore.model.IconDataExample;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IconDataMapper {

    long insert(IconData record);
    List<IconData> selectByExample(IconDataExample example);

}