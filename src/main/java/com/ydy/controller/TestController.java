package com.ydy.controller;

import com.ydy.entity.UserInfo;
import com.ydy.utils.MyRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TestController {


    @Autowired
    private MyRestTemplate myRestTemplate;



    /**
     * 测试页面
     * @param model
     * @return
     */
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("username","mike");
        return "test";
    }

    /**
     * 测试 spring restTemplate
     * @return
     */
    @GetMapping(value = "/restTemplate",produces = {"application/json;charset=utf-8;"})
    @ResponseBody
    public String restTemplate(){
        String s = myRestTemplate.getForObject("http://121.199.2.1/getJson",String.class);
        System.out.println(s);
        return s;
    }
}
