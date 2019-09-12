package com.alice.service;

import com.alice.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> select(UserInfo userInfo);
}
