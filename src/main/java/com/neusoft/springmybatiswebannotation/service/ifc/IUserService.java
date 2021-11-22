package com.neusoft.springmybatiswebannotation.service.ifc;


import com.neusoft.springmybatiswebannotation.pojo.Users;

/**
 * @author: wudagai
 * @date: 2021/11/4 15:40
 * @description:
 */
public interface IUserService {
    public Users findUsersById(Integer id);


}
