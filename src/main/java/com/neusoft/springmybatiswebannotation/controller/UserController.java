package com.neusoft.springmybatiswebannotation.controller;

import com.neusoft.springmybatiswebannotation.pojo.Users;
import com.neusoft.springmybatiswebannotation.service.ifc.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wudagai
 * @date: 2021/11/5 14:10
 * @description:
 */
@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/queryUserById")
    public Users queryUserById(){
        return  userService.findUsersById(121);
    }
}
