package com.alice.controller;

import com.alice.bean.members;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "members")
public class membersController{

    @RequestMapping(value = "/select/{testPathVariable}")
    public String select(@PathVariable("testPathVariable") String testPathVariable, @RequestParam(value = "name") String username){

        System.out.println(username+testPathVariable);
        return username;
    }


}