package impl;

import com.alice.bean.members;
import com.alice.dao.membersMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import service.membersService;

public class membersServiceImpl implements membersService {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public members selectMembers(members param) {
       membersMapper mapper = this.sqlSession.getMapper(membersMapper.class);
       mapper.insert(param);

       members info = mapper.selectByPrimaryKey(param.getId());

       return info;
    }
}
