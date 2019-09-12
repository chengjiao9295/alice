package com.alice.service;

import com.alice.bean.UserInfo;
import com.alice.dao.UserInfoMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<UserInfo> select(UserInfo userInfo){
        UserInfoMapper mapper = this.sqlSession.getMapper(UserInfoMapper.class);
        UserInfo entity = new UserInfo();
        entity.setName(userInfo.getName());
        entity.setPwd(userInfo.getPwd());
        entity.setEmail(userInfo.getEmail());

        return mapper.select(entity);
    }

}
