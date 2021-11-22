package com.neusoft.springmybatiswebannotation.service.impl;

import com.neusoft.springmybatiswebannotation.dao.UserMapper;
import com.neusoft.springmybatiswebannotation.pojo.Users;
import com.neusoft.springmybatiswebannotation.service.ifc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2021/11/5 13:50
 * @description:
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users findUsersById(Integer id) {
        return userMapper.queryUserById(id);
    }
}
