package com.alice.service;

import com.alice.bean.UserInfo;
import com.alice.dao.UserInfoMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public UserInfo selectRoot(){
        UserInfoMapper mapper = this.sqlSession.getMapper(UserInfoMapper.class);
        return mapper.selectByPrimaryKey("root");
    }

}
