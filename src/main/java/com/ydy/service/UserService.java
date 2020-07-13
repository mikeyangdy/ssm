package com.ydy.service;

import com.ydy.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    String queryDBVersion();

    List<UserInfo> findAllUser();
}
