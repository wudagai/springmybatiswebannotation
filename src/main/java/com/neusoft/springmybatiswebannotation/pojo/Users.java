package com.neusoft.springmybatiswebannotation.pojo;

import lombok.Data;

/**
 * @author: wudagai
 * @date: 2021/11/4 15:35
 * @description:
 */
@Data
public class Users {
    private Integer userId;
    private String phone;
    private String userName;
    private Integer userSex;
    private String userImg;
    private Integer delTag;
    private Integer money;

}
