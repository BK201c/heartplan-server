package com.uuget.heartplanServer.model.entity;

import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String wechatOpenid;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String age;
    private String sex;
    private String createdAt; // 创建时间
    private String updatedAt; // 更新时间
}
