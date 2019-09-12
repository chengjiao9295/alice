package com.alice.dao;

import com.alice.bean.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String name);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> select(UserInfo userInfo);
}