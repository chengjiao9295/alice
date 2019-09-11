package com.alice.controller;

import com.alibaba.fastjson.JSONObject;
import com.alice.bean.UserInfo;
import com.alice.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "userInfo")
public class UserInfoController {

    @Autowired
    protected UserInfoService userInfoService;

    @RequestMapping(value="/select")
    public UserInfo selectUser(){
        UserInfo result = userInfoService.selectRoot();

        return  result;
    }

}

