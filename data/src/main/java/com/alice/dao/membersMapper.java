package com.alice.dao;

import com.alice.bean.members;

public interface membersMapper {
    int deleteByPrimaryKey(String id);

    int insert(members record);

    int insertSelective(members record);

    members selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(members record);

    int updateByPrimaryKey(members record);
}