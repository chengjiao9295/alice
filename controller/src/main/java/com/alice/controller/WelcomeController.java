package com.alice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {


    //跳转到登陆页面
    @RequestMapping("/index")
    public String index(){
        System.out.println("qianduan");
        return "front/html/login.html";
    }

}