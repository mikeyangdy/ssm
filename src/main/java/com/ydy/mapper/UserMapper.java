package com.ydy.mapper;

import com.ydy.entity.UserInfo;

import java.util.List;

public interface UserMapper {

    String queryDBVersion();

    List<UserInfo> findAllUser();
}
