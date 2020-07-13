package com.ydy.service.impl;


import com.ydy.entity.UserInfo;
import com.ydy.mapper.UserMapper;
import com.ydy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String queryDBVersion(){
        return userMapper.queryDBVersion();
    }

    @Override
    public List<UserInfo> findAllUser() {
        return userMapper.findAllUser();
    }
}
