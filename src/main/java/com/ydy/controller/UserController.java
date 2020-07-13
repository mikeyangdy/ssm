package com.ydy.controller;

import com.ydy.entity.UserInfo;
import com.ydy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    @ResponseBody
    public List<UserInfo> findAllUser(){
        return userService.findAllUser();
    }

    @RequestMapping("/user")
    public String test(){
        return "user";
    }


}
