package com.uuget.heartplanServer.model.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
    private Long uid;
    private String wechatOpenid;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String age;
    private String sex;
    private Date createdAt; // 创建时间
    private Date updatedAt; // 更新时间
}
