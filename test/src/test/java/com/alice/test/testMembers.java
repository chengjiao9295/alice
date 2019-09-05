package com.alice.test;

import com.alice.bean.members;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.UUIDUtilService;
import service.membersService;

public class testMembers extends AbstractTestBase{

    @Autowired
    protected membersService service;

    @Autowired
    protected UUIDUtilService utilService;

    @Test
    public void test(){
        members param = new members();
        String id = utilService.getUUID();
        param.setId(id);
        param.setName("xiaoming");
        param.setAge(20);
        param.setJob("worker");
        param.setHobbies("basketball");

        members info = service.selectMembers(param);
        System.out.println(info.getId());
    }

}
