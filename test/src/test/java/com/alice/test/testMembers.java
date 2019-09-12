package com.alice.test;

import com.alice.bean.UserInfo;
import com.alice.bean.members;
import com.alice.service.UserInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.alice.service.UUIDUtilService;
import com.alice.service.membersService;

import java.util.List;

public class testMembers extends AbstractTestBase{

    @Autowired
    protected membersService service;

    @Autowired
    protected UUIDUtilService utilService;

    @Autowired
    protected UserInfoService userInfoService;

    @Test
    public void test(){
        members param = new members();
        String id = utilService.getUUID();
        param.setId(id);
        param.setName("xiaoming");
        param.setAge(20);
        param.setJob("worker");
        param.setHobbies("basketball");

        String info = service.hello();
        System.out.println(info);
        members members = service.selectMembers(param);
        System.out.println(members.getId());
        UserInfo userInfo = new UserInfo();
        userInfo.setName("root");
        userInfo.setEmail("root@qq.com");
        userInfo.setPwd("123456");
        List<UserInfo> result= userInfoService.select(userInfo);
        System.out.println(result);

    }

}
