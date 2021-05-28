package com.wang.dao;

import com.wang.entity.User;

import java.util.List;

/**
 * @author 王冰炜
 * @create 2021-05-28 14:54
 */
public interface UserMapper {
    public List<User> selectUser();
}
