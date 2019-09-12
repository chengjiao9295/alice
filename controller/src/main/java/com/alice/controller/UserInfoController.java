package com.alice.controller;

import com.alibaba.fastjson.JSONObject;
import com.alice.bean.UserInfo;
import com.alice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    protected UserInfoService userInfoService;

    @RequestMapping(value="/select")
    public String select(@ModelAttribute UserInfo userInfo){
        List<UserInfo> result = userInfoService.select(userInfo);
        if(result.isEmpty()){
            return "front/html/login.html";
        }
        return "front/html/main.html";
    }

}

