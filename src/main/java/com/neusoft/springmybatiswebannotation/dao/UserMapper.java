package com.neusoft.springmybatiswebannotation.dao;

import com.neusoft.springmybatiswebannotation.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: wudagai
 * @date: 2021/11/5 13:48
 * @description:
 */
@Mapper
public interface UserMapper {
//    @Select("select * from elm_user where userId=#{id}")
//    public Users queryUserById(Integer id);

     public Users queryUserById(Integer id);

}
