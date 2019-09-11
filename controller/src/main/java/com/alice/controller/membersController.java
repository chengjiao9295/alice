package com.alice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alice.bean.members;
import com.alice.service.membersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "members")
public class membersController{
    @Autowired
    protected membersService membersService;
    @RequestMapping(value = "/select/{testPathVariable}")
    public JSONObject select(@PathVariable("testPathVariable") String testPathVariable, @RequestParam(value = "name") String username){

        String result = membersService.hello();
        JSONObject A= new JSONObject();
        A.put("a","b");
        return  A;
    }


}