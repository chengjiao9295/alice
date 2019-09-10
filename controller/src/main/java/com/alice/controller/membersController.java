package com.alice.controller;

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
    public String select(@PathVariable("testPathVariable") String testPathVariable, @RequestParam(value = "name") String username){

        System.out.println(membersService.hello());
        return username;
    }


}