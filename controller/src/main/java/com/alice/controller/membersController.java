package com.alice.controller;

import com.alice.bean.members;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "members")
public class membersController{

    @RequestMapping("select")
    public String select(@RequestParam(value = "name") String username){

        System.out.println(username);
        return username;
    }


}