package com.wang.dao;

import com.wang.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 王冰炜
 * @create 2021-05-28 15:17
 */

public class UserDaoImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

}
