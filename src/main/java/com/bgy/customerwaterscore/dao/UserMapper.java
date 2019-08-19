package com.bgy.customerwaterscore.dao;

import com.bgy.customerwaterscore.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by zl on 2015/8/27.
 */
@Component
public interface UserMapper {
    public User findUserInfo();
}
